package com.signimus.Student.Managment.entity;

import jakarta.persistence.*;

@Table
@Entity(name = "students")
public class Studentt {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String email;
    private int age;

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Studentt(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

}
