package com.revature.auth;

import com.revature.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<Object> authenticate(@RequestBody AuthenticationRequest request){
        AuthenticationResponse as =service.authenticate(request);
        if(as!=null) {
            return ResponseEntity.ok(as);
        }
        else{
            return ResponseEntity.status(404).body("incorrect username or password");
        }
    }

//    @GetMapping(value = "/login")
//    public ResponseEntity<Object> loginuser (@RequestBody User user) {
//        User user1 = US.findUsernameAndPassword(user.getUsername(),user.getPassword());
//        if(user1!=null){
//            return ResponseEntity.ok().body(user1);
//        }else{
//            return ResponseEntity.status(404).body("Username and Password are incorrect");
//        }
//    }
}
