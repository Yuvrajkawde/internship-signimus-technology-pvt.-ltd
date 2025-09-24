package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.entity.Studentt;

import java.util.List;

public interface StudentServiceInterface {
    public Studentt savestudent(Studentt studentt);
    public Studentt findById(Long StudentId);
    public List<Studentt> findAllStudent();
     public Studentt updateStudentData(Long id, Studentt student);
     public  String deleteStudent(Long id);
      public Studentt findByEmail(String email);
      public List<Studentt> findByNameAndAge(String name, int age);
}
