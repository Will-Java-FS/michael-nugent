package com.revature.controllers;
import com.revature.models.User;
import com.revature.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService US;
    // DS;

    @Autowired
    public UserController(UserService US) {
        this.US = US;
    }

    //@Autowired
    //public UserController(DreamService DS) {
//this.DS = DS;
    //}

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
       if(user1!=null){
           return ResponseEntity.ok().body(user1);
       }else{
           return ResponseEntity.status(404).body("Username not found");

       }
            //return US.findUsername(user.getUsername());
    }

    @GetMapping(value = "/login")
    public ResponseEntity<Object> loginuser (@RequestBody User user) {
        User user1 = US.findUsernameAndPassword(user.getUsername(),user.getPassword());
        if(user1!=null){
            return ResponseEntity.ok().body(user1);
        }else{
            return ResponseEntity.status(404).body("Username and Password are incorrect");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteuser(@PathVariable int id){
        US.deleteById(id);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return US.getById(id);
    }
}







