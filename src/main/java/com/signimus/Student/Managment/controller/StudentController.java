package com.signimus.Student.Managment.controller;
import com.signimus.Student.Managment.dto.PagedResponse;
import com.signimus.Student.Managment.entity.Studentt;
import com.signimus.Student.Managment.service.studentService.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

//    @Autowired
    private final  StudentServiceImpl studentServiceimpl;

 //constructor injection
    public StudentController(StudentServiceImpl studentServiceimpl) {
        this.studentServiceimpl = studentServiceimpl;
    }

    @PostMapping("add-student")
    public ResponseEntity<Studentt >addStudent(@RequestBody Studentt studentt){

        Studentt studentt1 = studentServiceimpl.savestudent(studentt);
        return new ResponseEntity<>(studentt1, HttpStatus.CREATED);
    }

    @GetMapping("get-student/{id}")
    public ResponseEntity<Studentt > searchById(@PathVariable Long id) {
        Studentt studenttById = studentServiceimpl.findById(id);
        return new ResponseEntity<>(studenttById, HttpStatus.OK);
    }

   @GetMapping("/get-all-std")
    public ResponseEntity<List<Studentt>> getAllStudent() {
        List<Studentt> allStudent = studentServiceimpl.findAllStudent();

        // If you prefer to return 204 when there are no students:
        if (allStudent == null || allStudent.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        // Otherwise return 200 OK with the list
        return ResponseEntity.ok(allStudent);
    }


    



    @PutMapping("update-student/{id}")
    public ResponseEntity<Studentt > updateStudent(@PathVariable Long id, @RequestBody Studentt studentt){
        Studentt studentt1 = studentServiceimpl.updateStudentData(id, studentt);
        return new ResponseEntity<>(studentt1, HttpStatus.OK);
    }
    @DeleteMapping("delete-student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        String deleted = studentServiceimpl.deleteStudent(id);
        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }

     @GetMapping("find-by-email/{email}")
    public Studentt searchByEmail(@PathVariable String email){
        Studentt student = studentServiceimpl.findByEmail(email);
        return student;
    }

     @GetMapping("get-student-By")
    public ResponseEntity<List<Studentt>> getStudentByNameAndAge(@RequestParam (name="studentName", required = false) String name, @RequestParam int age){
         List<Studentt> byNameAndAge = studentServiceimpl.findByNameAndAge(name, age);
         return new ResponseEntity<>(byNameAndAge, HttpStatus.OK);
     }

    @RequestMapping(path = "add-new-std", method = RequestMethod.POST)
    public Studentt addNewStudent(@RequestBody Studentt studentt) {
    return studentServiceimpl.savestudent(studentt);
}


    @GetMapping("get-studentListByAge/{age}")
    public ResponseEntity<List<Studentt>> findStudentListByAge(@PathVariable int age){
        List<Studentt> studentByAge = studentServiceimpl.findStudentByAge(age);
        return new ResponseEntity<>(studentByAge, HttpStatus.OK);
    }

     @GetMapping("get-studentBy-page")
    public ResponseEntity<Page<Studentt>> getAllStudentInPage(
            @RequestParam int pageNumber,
            @RequestParam int pageSize
    ){
        Page<Studentt> allStudentPage = studentServiceimpl.getAllStudentPage(pageNumber, pageSize);
        return new ResponseEntity<>(allStudentPage,HttpStatus.OK);
    }


}
