package com.signimus.Student.Managment.controller;

import com.signimus.Student.Managment.entity.Studentt;
import com.signimus.Student.Managment.service.studentService.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    public  StudentServiceImpl studentServiceimpl;


   @PostMapping("add-student")
    public Studentt addStudent(@RequestBody Studentt studentt){

        Studentt studentt1 = studentServiceimpl.savestudent(studentt);
        return studentt1;
    }
}
