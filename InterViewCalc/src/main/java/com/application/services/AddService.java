package com.application.services;


import org.springframework.stereotype.Service;

import com.application.model.Result;

@Service
public class AddService {
    public Result add(int a, int b) {
        int sum = a + b;
        return new Result(sum);
    }
}
