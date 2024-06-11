package org.example.controller;

import org.example.service.FactoryService;
import org.example.service.ReagentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Factory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController
{
    private ReagentsService reagentsService;

    @GetMapping(value = "/reagents")
    public void reagentsInputList(@RequestBody String rId,String rFactory)
    {
        reagentsService.insertReagents(rId,rFactory);
    }

    @Autowired
    public InputController(ReagentsService reagentsService)
    {
        this.reagentsService = reagentsService;
    }
}
