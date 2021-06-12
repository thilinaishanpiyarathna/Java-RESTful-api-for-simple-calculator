package com.application.services;


import org.springframework.stereotype.Service;

import com.application.model.Result;

@Service
public class MultService {
    public Result mult(int a, int b) {
        int mult = a * b;
        return new Result(mult);
    }
}
