package com.littlesekii.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class ApiController {
    
    @GetMapping("/")
    public String start() {
        return "Welcome to API!";
    }
    
}
