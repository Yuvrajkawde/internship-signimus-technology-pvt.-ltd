package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.entity.Studentt;
import com.signimus.Student.Managment.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl  implements StudentServiceInterface{

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Studentt savestudent(Studentt studentt) {
        Studentt savedStudent = studentRepository.save(studentt);
        return savedStudent;
    }

    @Override
    public Studentt findById(Long StudentId) {
        Optional<Studentt> optionalStudentt = studentRepository.findById(StudentId);
        if (optionalStudentt.isPresent()){
            Studentt studentt = optionalStudentt.get();
            return studentt;
        }else {
            throw new RuntimeException("student not found for id "+ StudentId);
        }

    }
}
