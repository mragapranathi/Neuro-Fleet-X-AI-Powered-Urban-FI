package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private List<String> tasks = new ArrayList<>();

    @PostMapping
    public String addTask(@RequestBody String task) {
        tasks.add(task);
        return "Added: " + task;
    }

    @GetMapping
    public List<String> getTasks() {
        return tasks;
    }

    @DeleteMapping("/{index}")
    public String deleteTask(@PathVariable int index) {
        return "Deleted: " + tasks.remove(index);
    }
}
