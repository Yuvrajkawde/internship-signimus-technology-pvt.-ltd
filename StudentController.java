package com.signimus.Student.Managment.controller;

import com.signimus.Student.Managment.entity.Studentt;
import com.signimus.Student.Managment.service.studentService.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public  StudentServiceImpl studentServiceimpl;


   @PostMapping("add-student")
    public Studentt addStudent(@RequestBody Studentt studentt){

        Studentt studentt1 = studentServiceimpl.savestudent(studentt);
        return studentt1;
    }

    @GetMapping("get-student/{id}")
    public Studentt searchById(@PathVariable Long id) {
        Studentt studenttById = studentServiceimpl.findById(id);
        return studenttById;
    }

    @GetMapping("get-all-std")
    public List<Studentt> getAllStudent(){
        List<Studentt> allStudent = studentServiceimpl.findAllStudent();
        return allStudent;

    }
}
