package com.application.courselibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.courselibrary.entity.AdminEntity;
import com.application.courselibrary.repository.AdminRepo;

@RestController

public class LoginController {

@Autowired 
private AdminRepo adminrepo;


 @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        AdminEntity admin = adminrepo.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return "login successful";
        } else {
            return "login failed";
        }
    }


}
