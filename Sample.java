package com.demoproject.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
