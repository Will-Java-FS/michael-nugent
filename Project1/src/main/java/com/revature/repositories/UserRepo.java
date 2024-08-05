package com.revature.repositories;

import com.revature.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findAll();

    User findByUsername(String username);

    // @Query("From users WHERE username= :username AND password=:password")
    User findByUsernameAndPassword(String username, String password);

    //JpaRepository implements this by default
//   User findById(int id);

}
