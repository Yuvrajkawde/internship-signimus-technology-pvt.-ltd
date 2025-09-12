package com.signimus.Student.Managment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

    @GetMapping("api")
    public String show(){
        return "hello there";
    }
}
