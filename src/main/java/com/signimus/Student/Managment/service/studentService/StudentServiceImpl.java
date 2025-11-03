package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.Exceptions.CustomException;
import com.signimus.Student.Managment.dto.PagedResponse;
import com.signimus.Student.Managment.entity.Studentt;
import com.signimus.Student.Managment.repositories.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class StudentServiceImpl  implements StudentServiceInterface{


    public StudentRepository studentRepository;

    // setter injection
    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

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
             log.info("student found");
            return studentt;
        }else {
             log.error("student not found while finding student "+ StudentId);
            throw new CustomException.StudentNotFoundException("student not found for id "+ StudentId);
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
            log.warn("user can deleted");
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

//    @Override
//    public List<Studentt> findStudentByAge(int age) {
//        List<Studentt> students = studentRepository.getStudentListByAge(age).orElseThrow(() -> new CustomException.StudentNotFoundByAgeException("student not found by this age : " + age));
//
//        return students;
//    }

    @Override
    public List<Studentt> findStudentByAge(int age) {
        List<Studentt> students = studentRepository.getStudentListByAge1(age).orElseThrow(() -> new CustomException.StudentNotFoundByAgeException("student not found by this age : " + age));

        return students;
    }

@Override
    public Page<Studentt> getAllStudentPage(int pageNumber, int pageSize) {

        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        Page<Studentt> allStudents = studentRepository.findAll(pageable);

        return allStudents;
    }


}
