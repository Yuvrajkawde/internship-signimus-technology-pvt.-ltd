package com.signimus.Student.Managment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
@Entity

public class Studentt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name ;
    private String email;
    private int age;

     private int height;

    @Transient
    private String standard;

    @Enumerated(EnumType.STRING)
    private Designation designation;

    private LocalDateTime joiningDate;


    @PrePersist
    protected void onCreate(){
        joiningDate = LocalDateTime.now();
    }

//One student can have One profile
        @OneToOne(mappedBy = "student")
        @JsonIgnore
        private StudentProfile studentProfile;
}
