package org.example.controller;

import org.example.pojo.Reagents;
import org.example.service.ReagentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ReagentsController {

    @Autowired
    private ReagentsService reagentsService;

    @RequestMapping("/reagents")
    public ModelAndView showReagents() throws Exception
    {
        ModelAndView modelAndView = new ModelAndView("reagents");
        List<Reagents> reagents = reagentsService.selectAllReagent();
        modelAndView.addObject("reagents", reagents);
        return modelAndView;
    }
}
