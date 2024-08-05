package com.revature.controllers;

import com.revature.config.JwtService;
import com.revature.models.Dream;
import com.revature.services.DreamService;
import com.revature.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dreams")
@RequiredArgsConstructor
public class DreamController {

    @Autowired
    JwtService jwtService;
    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
    DreamService ds;
    @Autowired
    UserService userService;

    @GetMapping
    public List<Dream> getAllDreams() {
        return ds.getAllDreams();
    }

    @GetMapping("/{id}")
    public Dream getDream(@PathVariable int id) {
        return ds.getDream(id);
    }

    @GetMapping("/user/{fk_userid}")
    public List<Dream> getAllDreamsByUser(@PathVariable int fk_userid) {
        return ds.getAllDreamsByUser(fk_userid);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Dream addDream(@RequestHeader("Authorization") String authorizationHeader, @RequestBody Dream dream) {

        int userId = getUserIdFromAuthHeader(authorizationHeader);

        return ds.addDream(userId, dream);
    }

    @PutMapping(value = "/{dreamId}", consumes = "application/json", produces = "application/json")
    public Dream updateDream(@RequestHeader("Authorization") String authorizationHeader, @PathVariable int dreamId, @RequestBody Dream dream) {

        int userId = getUserIdFromAuthHeader(authorizationHeader);

        return ds.updateDream(userId, dreamId, dream);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDreamById(@PathVariable int id) {

//        return ds.deleteDreamById(id);
        Dream dream =ds.getDream(id);

        if(dream!=null) {
            Dream del = ds.deleteDreamById(id);
            return ResponseEntity.ok().body(del);
        }
        else {
            return ResponseEntity.status(404).body("Dream doesn't exist");
        }
    }

    private int getUserIdFromAuthHeader(String authHeader) {
        //extract jwt from request header
        //Assume authHeader is not null because previous filter stopped non-authorized requests
        final String jwt = authHeader.substring(7);
        final String username = jwtService.extractUsername(jwt);

        //Retrieve userId from user retrieval based on username property
        return userService.findUsername(username).getU_id();
    }

}
