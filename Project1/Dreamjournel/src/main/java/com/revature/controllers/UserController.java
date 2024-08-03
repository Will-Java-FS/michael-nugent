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
    public User finduser (@RequestBody User user) {
        return US.findUsername(user.getUsername());

    }
    @GetMapping(value = "/login")
    public User loginuser (@RequestBody User user) {
        return US.findUsernameAndPassword(user.getUsername(),user.getPassword());

    }
}


  // @GetMapping("/{id}")
  //  public List<Dream> getAllDreamsByUser(@PathVariable int userid){
  //      return DS.getAllDreamsByUser(userid);
  //  }





