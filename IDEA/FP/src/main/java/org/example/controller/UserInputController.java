package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserInputController {
    @GetMapping("/userInput")
    public String user() {
        return "user";
    }
}
