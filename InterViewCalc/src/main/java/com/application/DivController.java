package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Result;
import com.application.services.DivService;




@RestController
@RequestMapping("div")
public class DivController {

    @Autowired
    private DivService divService;

    @GetMapping
    public Result div(@RequestParam int a, @RequestParam int b) {
        return divService.div(a, b);
    }
}
