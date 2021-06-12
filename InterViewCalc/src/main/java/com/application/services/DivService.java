package com.application.services;

import org.springframework.stereotype.Service;

import com.application.model.Result;



@Service
public class DivService {
	
	public Result div(int a, int b) {
		int div = a / b;
        return new Result(div);
        
    }

}
