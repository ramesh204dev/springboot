package com.example.spring.boot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @GetMapping
    public String home(){
        return "Welcome to Spring Boot v3";
    }
}
