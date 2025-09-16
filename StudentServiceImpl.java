package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.entity.Studentt;
import com.signimus.Student.Managment.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  implements StudentServiceInterface{

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Studentt savestudent(Studentt studentt) {
        Studentt savedStudent = studentRepository.save(studentt);
        return savedStudent;
    }
}
