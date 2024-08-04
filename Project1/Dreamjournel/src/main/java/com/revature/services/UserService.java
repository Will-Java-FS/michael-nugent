package com.revature.services;

import com.revature.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User saveUser(User user);

    User findUsername(String username);

    User findUsernameAndPassword(String username, String password);

    User getById(int id);

    void deleteById(int id);
}
