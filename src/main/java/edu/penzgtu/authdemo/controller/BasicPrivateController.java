package edu.penzgtu.authdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicPrivateController {
    @GetMapping("/private/message")
    public String getMessage() {
        return "My private message";
    }
}
