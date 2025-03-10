package com.example.serst_api_mysql.controller;

import com.example.serst_api_mysql.model.User;
import com.example.serst_api_mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public @ResponseBody List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return userService.saverUser(user);
    }

    @PostMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer userId){
        return userService.getUserById(userId);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable ("id") Integer userId,@RequestBody User user){
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id")Integer id){
        return userService.deleteUser(id);
    }
}
