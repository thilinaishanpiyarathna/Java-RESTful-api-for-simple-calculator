package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Result;
import com.application.services.SubService;



@RestController
@RequestMapping("sub")
public class SubController {
	@Autowired
    private SubService subService;

    @GetMapping
    public Result sub(@RequestParam int a, @RequestParam int b) {
    	return subService.sub(a, b);
    }

}
