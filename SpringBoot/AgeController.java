package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AgeController {
    @GetMapping("/age")
    public String age(@RequestParam String name, @RequestParam int age) {
        return name + " is " + age + " years old.";
    }
}
