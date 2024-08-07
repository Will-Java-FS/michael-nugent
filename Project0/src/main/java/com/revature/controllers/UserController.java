package com.revature.controllers;

import com.revature.models.User;
import com.revature.services.DreamService;
import com.revature.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService US;

    @Autowired
    DreamService DS;

    @GetMapping()
    public List<User> getAllUser() {
        return US.getAllUser();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return US.saveUser(user);
    }

    @GetMapping(value = "/name")
    public ResponseEntity<Object> finduser(@RequestBody User user) {
        User user1 = US.findUsername(user.getUsername());
        if (user1 != null) {
            return ResponseEntity.ok().body(user1);
        } else {
            return ResponseEntity.status(404).body("Username not found");

        }
        //return US.findUsername(user.getUsername());
    }

    @GetMapping(value = "/login")
    public ResponseEntity<Object> loginuser(@RequestBody User user) {
        User user1 = US.findUsernameAndPassword(user.getUsername(), user.getPassword());
        if (user1 != null) {
            return ResponseEntity.ok().body(user1);
        } else {
            return ResponseEntity.status(404).body("Username and Password are incorrect");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteuser(@PathVariable int id) {
        US.deleteById(id);
        DS.deleteDreamsByUserid(id);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return US.getById(id);
    }
}







