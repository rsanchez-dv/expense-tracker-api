package com.workFromHome.expensetrackerapi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {
    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String,Object> userMap){
        String firstName = (String) userMap.get("firstName");
        String lastName = (String) userMap.get("lastNames");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        return firstName;
    }
    @GetMapping("/test")
    public String test(){
        return "<h1>HELLO</h1>";
    }
}
