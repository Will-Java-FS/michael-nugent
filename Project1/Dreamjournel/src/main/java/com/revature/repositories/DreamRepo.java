package com.revature.repositories;

import com.revature.models.Dream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DreamRepo extends JpaRepository<Dream, Integer> {

}
