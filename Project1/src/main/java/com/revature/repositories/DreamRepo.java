package com.revature.repositories;

import com.revature.models.Dream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DreamRepo extends JpaRepository<Dream, Integer> {

    List<Dream> findAll();

    Dream findDreamById(int id);

    @Query("SELECT d FROM Dream d WHERE d.fk_userid  = :fk_userid")
    List<Dream> findAllDreamByFk_userId (int fk_userid);
    Dream deleteById(int id);


    @Query("Delete FROM Dream d WHERE d.fk_userid  = :fk_userid")
    void deleteByFkUserId(int fk_userid);
}


//    List<Dream> findAll();

//    Dream findDreamById(int id);



