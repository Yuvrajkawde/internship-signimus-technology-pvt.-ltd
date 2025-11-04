package com.signimus.Student.Managment.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String teacherName;
    private String subject;
    private String email;


       @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
       List<Blog> blogs = new ArrayList<>();
}
