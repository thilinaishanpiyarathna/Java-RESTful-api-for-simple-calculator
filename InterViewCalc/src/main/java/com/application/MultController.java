package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Result;
import com.application.services.MultService;



@RestController
@RequestMapping("mult")
public class MultController {

    @Autowired
    private MultService multService;

    @GetMapping
    public Result mult(@RequestParam int a, @RequestParam int b) {
        return multService.mult(a, b);
    }
}
