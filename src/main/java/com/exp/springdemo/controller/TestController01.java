package com.exp.springdemo.controller;

import com.exp.springdemo.service.TestService01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController01 {

    @Autowired
    private TestService01 testService01;

    @GetMapping("/hello")
    public String hello(@RequestParam String inString){
        return testService01.hello(inString);
    }
}
