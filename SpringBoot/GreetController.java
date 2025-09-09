package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
