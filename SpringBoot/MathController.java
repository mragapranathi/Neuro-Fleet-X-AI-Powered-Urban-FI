package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.service.MathService;

@RestController
public class MathController {
    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return mathService.add(a, b);
    }
}
