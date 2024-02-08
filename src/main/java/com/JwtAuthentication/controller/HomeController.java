package com.JwtAuthentication.controller;

import com.JwtAuthentication.entity.User;
import com.JwtAuthentication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

//    http://localhost:8081/home/users

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("Get users");
        return this.userService.getUsers();
    }

}
