package com.signimus.Student.Managment.repositories;

import com.signimus.Student.Managment.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

     Optional<Teacher> findByEmail(String email);
    List<Teacher> findByTeacherName(String teacherName);
    List<Teacher> findBySubject(String subject);

}
