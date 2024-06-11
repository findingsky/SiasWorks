package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OutputController
{

    @GetMapping("/reagentsOutputList")
    public String reagentsOutputList() {
        return "reagentsOutputList";
    }
}
