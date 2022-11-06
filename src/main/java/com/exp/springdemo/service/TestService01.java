package com.exp.springdemo.service;

import org.springframework.stereotype.Service;

@Service
public class TestService01 {
    public String hello(String inString) {
        return inString + " hello world!";
    }
}
