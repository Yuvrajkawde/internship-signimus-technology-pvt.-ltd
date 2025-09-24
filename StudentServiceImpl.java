package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.entity.Studentt;
import com.signimus.Student.Managment.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public List<Studentt> findAllStudent() {
        return studentRepository.findAll();
        //return List.of();
    }


    public Studentt updateStudentData(Long id, Studentt student) {
    Optional<Studentt> optionalStudent = studentRepository.findById(id);
    if(optionalStudent.isPresent()){
        //database student
        Studentt studentData = optionalStudent.get();
        //data update
        studentData.setName(student.getName());
        studentData.setEmail(student.getEmail());
        studentData.setAge(student.getAge());

        //data save in db
        return studentRepository.save(studentData);

    }else{
        throw new RuntimeException("Student is not available by ID: "+id);
    }

}

    @Override
    public String deleteStudent(Long id) {

        Optional<Studentt> optionalStudentt = studentRepository.findById(id);
        if (optionalStudentt.isPresent()){
            studentRepository.deleteById(id);
            return "student record deleted";
        }else {
            return "record not found for given id "+id;
        }

    }

     @Override
    public Studentt findByEmail(String email) {
        return studentRepository.findByEmail(email);

    }

    @Override
    public List<Studentt> findByNameAndAge(String name, int age) {
        List<Studentt> student = studentRepository.findByNameAndAge(name, age);
        return student;
    }
}
