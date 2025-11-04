package com.signimus.Student.Managment.controller;


import com.signimus.Student.Managment.Exceptions.CustomException;
import com.signimus.Student.Managment.entity.Blog;
import com.signimus.Student.Managment.service.studentService.TeacherServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teacher/")
@RequiredArgsConstructor
public class TeacherController {

    @Autowired
   private final TeacherServiceImpl teacherService;

    @PostMapping("/create-new-blog/{teacher_id}")
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog, @PathVariable(name="teacher_id") Long id) throws CustomException.TeacherNotFoundException {
        Blog blog1 = teacherService.createBlog(blog, id);
        return new ResponseEntity<>(blog1, HttpStatus.CREATED);
    }

    @PutMapping("update-blog/{blogId}")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog, @PathVariable Long blogId){
        Blog blog1 = teacherService.updateBlog(blog, blogId);
        return new ResponseEntity<>(blog1, HttpStatus.OK);
    }

}