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
    @PutMapping("update-student/{id}")
    public Studentt updateStudent(@PathVariable Long id, @RequestBody Studentt studentt){
        Studentt studentt1 = studentServiceimpl.updateStudentData(id, studentt);
        return studentt1;
    }
    @DeleteMapping("delete-student/{id}")
    public String deleteStudent(@PathVariable Long id) {
      return studentServiceimpl.deleteStudent(id);
    }

     @GetMapping("find-by-email/{email}")
    public Studentt searchByEmail(@PathVariable String email){
        Studentt student = studentServiceimpl.findByEmail(email);
        return student;
    }

     @GetMapping("get-student-By")
    public List<Studentt> getStudentByNameAndAge(@RequestParam (name="studentName", required = false) String name, @RequestParam int age){
        return studentServiceimpl.findByNameAndAge(name,age);
    }
}
