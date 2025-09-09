package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class UserController {
    @PostMapping("/user")
    public String createUser(@RequestBody Map<String, String> user) {
        return "User " + user.get("name") + " created with email " + user.get("email");
    }
}
