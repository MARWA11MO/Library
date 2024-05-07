package com.application.courselibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.application.courselibrary.entity.AdminEntity;

@Repository
public interface AdminRepo extends JpaRepository<AdminEntity, Long> {

AdminEntity findByEmail(String email);

//AdminEntity findByEmailAndPassword(String username, String password);

 @Query("SELECT COUNT(u) > 0 FROM AdminEntity u WHERE u.email = :email")
   boolean findByemail(String email);

AdminEntity findByUsername(String username); 


    
}
