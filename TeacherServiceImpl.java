package com.signimus.Student.Managment.service.studentService;

import com.signimus.Student.Managment.Exceptions.CustomException;
import com.signimus.Student.Managment.entity.Blog;
import com.signimus.Student.Managment.entity.Teacher;
import com.signimus.Student.Managment.repositories.BlogRepository;
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

    @Autowired
    private BlogRepository blogRepository;

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

     @Override
    public Blog createBlog(Blog blog, Long id) throws CustomException.TeacherNotFoundException {
        Teacher foundTreacher = teacherRepository.findById(id).orElseThrow(() -> new CustomException.TeacherNotFoundException("teacher is not found"));
        blog.setTeacher(foundTreacher);
        return blogRepository.save(blog);
    }

    @Override
    public Blog updateBlog(Blog blog, Long blogId) {
        Blog foundBlog = blogRepository.findById(blogId).orElseThrow(() -> new RuntimeException("blog not found"));
        foundBlog.setTitle(blog.getTitle());
        foundBlog.setContent(blog.getContent());
        return blogRepository.save(foundBlog);

    }
}
