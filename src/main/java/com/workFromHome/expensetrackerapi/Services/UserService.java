package com.workFromHome.expensetrackerapi.Services;

import com.workFromHome.expensetrackerapi.Models.User;
import com.workFromHome.expensetrackerapi.Repository.UserRepository;
import com.workFromHome.expensetrackerapi.Security.AuthenticationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Service("userService")
public class UserService {
    @Autowired
    UserRepository userRepo;
    @Autowired
    AuthenticationUtils authTools;

    public String createUser(User newUser){
        // Hash Password
        byte[] hashedPW = authTools.hashPassword(newUser.getPassword());
        System.out.println(Arrays.toString(hashedPW));
        newUser.setPassword(new String(hashedPW));
        // Store user in DB
        userRepo.save(newUser);
        return "Done";
    }
    public String authenticateUser(User existingUser){

        return "FOUND";
    }

}
