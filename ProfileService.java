package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.Exceptions.CustomException;
import com.signimus.Student.Managment.entity.StudentProfile;
import com.signimus.Student.Managment.entity.Studentt;
import com.signimus.Student.Managment.repositories.StudentProfileRepository;
import com.signimus.Student.Managment.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {
    @Autowired
    private final StudentProfileRepository studentProfileRepository;

    @Autowired
    private final StudentRepository studentRepository;


    public StudentProfile createProfile(StudentProfile profile, Long studentId){
        Studentt student = studentRepository.findById(studentId).orElseThrow(() -> new CustomException.StudentNotFoundByAgeException("student not found by this id" + studentId));
        profile.setStudent(student);
        return studentProfileRepository.save(profile);
    }


}