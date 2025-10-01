package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.entity.Teacher;

public interface TeacherServiceInterface {

    public Teacher saveTeacher(Teacher teacher);
    public Teacher updateTeacher(Teacher teacher, Long id);
}

