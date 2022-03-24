package com.example.simplespringapp.controllers;

import com.example.simplespringapp.models.User;
import com.example.simplespringapp.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class TestController {
    private UserService userService;
    private ObjectMapper objectMapper;

    @Autowired
    public TestController(UserService userService, ObjectMapper objectMapper) {
        this.userService = userService;
        this.objectMapper = objectMapper;
    }

    @PostMapping
    public boolean postUser(@RequestBody User user) {
        // return 418 status code

        return userService.postUser(user);
    }

    @GetMapping("/{iD}")
    public String getUserById(@PathVariable("iD") Integer iD) {

        return userService.getUserById(iD).toString();
    }
}
