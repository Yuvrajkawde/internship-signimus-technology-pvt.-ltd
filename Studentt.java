package com.signimus.Student.Managment.entity;

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

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Studentt(String name, String email, int age) {
//        this.name = name;
//        this.email = email;
//        this.age = age;
//    }
//
//    public Studentt(Long id, String name, String email, int age) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.age = age;
//    }
//
//    public Studentt() {
//    }
}
