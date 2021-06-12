package com.application.services;

import org.springframework.stereotype.Service;

import com.application.model.Result;



@Service
public class SubService {
	
	public Result sub(int a, int b) {
		int sub = a - b;
        return new Result(sub);
        
    }

}
