package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.Exceptions.CustomException;
import com.signimus.Student.Managment.entity.Blog;
import com.signimus.Student.Managment.entity.Teacher;

public interface TeacherServiceInterface {

    public Teacher saveTeacher(Teacher teacher);
    public Teacher updateTeacher(Teacher teacher, Long id);
    public Blog createBlog(Blog blog, Long id) throws CustomException.TeacherNotFoundException;
    public Blog updateBlog(Blog blog, Long blogId);
}

