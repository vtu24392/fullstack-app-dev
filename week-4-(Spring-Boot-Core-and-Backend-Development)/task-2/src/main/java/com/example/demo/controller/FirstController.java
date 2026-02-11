package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String home() {
        return "App is running";
    }

    @GetMapping("/api/hello")
    public String helloApi() {
        return "Hello from Postman API";
    }
}


