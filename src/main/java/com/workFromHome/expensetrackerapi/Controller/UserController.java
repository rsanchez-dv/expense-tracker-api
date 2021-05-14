package com.workFromHome.expensetrackerapi.Controller;

import com.workFromHome.expensetrackerapi.Models.User;
import com.workFromHome.expensetrackerapi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
//@CrossOrigin
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService user_service;

    @PostMapping("/register")
    public String registerUser(@RequestBody User newUser){
        return user_service.createUser(newUser);
    }

    @PostMapping("/login")
    public String authenticateUser(@RequestBody User existingUser){
        return user_service.authenticateUser(existingUser);
    }
    @GetMapping("/test")
    public String test(){
        return "<h1>HELLO</h1>";
    }
}
