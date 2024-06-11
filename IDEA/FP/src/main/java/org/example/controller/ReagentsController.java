package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReagentsController {

    @GetMapping("/reagents")
    public String reagents() {
        return "reagents";
    }
}
