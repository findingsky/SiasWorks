package org.example.controller;

import org.example.pojo.Reagents;
import org.example.service.ReagentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class OutputController
{
    @Autowired
    private ReagentsService reagentsService;

    @GetMapping("/output")
    public void reagentsOutput(@RequestBody String rId, String rUser,boolean rUsed) throws Exception
    {
        reagentsService.updateReagents(rId.toCharArray(),rUser.toCharArray(),rUsed);
    }

    @Autowired
    public OutputController(ReagentsService reagentsService)
    {
        this.reagentsService = reagentsService;
    }
}
