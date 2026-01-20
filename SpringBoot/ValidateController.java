package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ResponseStatus(HttpStatus.BAD_REQUEST)
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

@RestController
public class ValidateController {
    @GetMapping("/validateAge")
    public String validateAge(@RequestParam int age) {
        if (age < 18) throw new InvalidAgeException("Age must be 18+");
        return "Valid age: " + age;
    }
}
