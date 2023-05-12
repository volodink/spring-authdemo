package edu.penzgtu.authdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicPublicController {
    @GetMapping("/public/message")
    public String getMessage() {
        return "My public message";
    }
}
