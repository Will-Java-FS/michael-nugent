package com.revature.services;

import com.revature.models.User;
import com.revature.repositories.DreamRepo;
import com.revature.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    DreamRepo DR;
    @Autowired
    UserRepo UR;

    @Override
    public List<User> getAllUser() {
        return UR.findAll();
    }

    @Override
    public User saveUser(User user) {
        return UR.save(user);
    }
    @Override
    public User findUsername(String username){
       return  UR.findByUsername(username);

    }
    @Override
    public User findUsernameAndPassword(String username, String password){
        return UR.findByUsernameAndPassword(username,password);
    }
}
