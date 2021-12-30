package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(){
        System.out.println("Service called");
        return "Greeting Akash !";
    }
}
