package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

@RestController
public class ProductController {
    @GetMapping("/product")
    public Product getProduct() {
        return new Product("Laptop", 75000.0);
    }
}
