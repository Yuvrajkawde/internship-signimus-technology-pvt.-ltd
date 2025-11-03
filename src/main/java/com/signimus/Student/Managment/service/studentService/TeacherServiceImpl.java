package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.entity.Teacher;
import com.signimus.Student.Managment.repositories.TeacherRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class TeacherServiceImpl implements TeacherServiceInterface{

    private TeacherRepository teacherRepository;

    @Autowired
    public void setTeacherReposirory(TeacherRepository teacherReposirory) {
        this.teacherRepository = teacherReposirory;
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {

        Teacher teacher1 = teacherRepository.save(teacher);
        return teacher1;
    }



    @Override
    public Teacher updateTeacher(Teacher teacher, Long id) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(id);
        if (optionalTeacher.isPresent()) {
//            Teacher teacher1 = optionalTeacher.get();
//            teacher1.setTeacherName(teacher.getTeacherName());
//            teacher1.setEmail(teacher.getEmail());
//            teacher1.setSubject(teacher.getSubject());

//            using @Builder
            Teacher teacher1 = Teacher.builder()
                    .teacherName(teacher.getTeacherName())
                    .subject(teacher.getSubject())
                    .email(teacher.getEmail()).build();


            return teacherRepository.save(teacher1);
        } else {
            throw new RuntimeException("user not found");
        }
    }
}
