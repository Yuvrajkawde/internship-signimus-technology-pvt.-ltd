package com.comperator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{

    private String name;
    private int rollNo ;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollNo=" + rollNo + ", age=" + age + '}';
    }
}

class StudentSortingAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}

class StudentSortingRollNo implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNo() - o2.getRollNo();
    }
}

public class SortStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("dhoni",102, 40));

        list.add(new Student("sachin",101, 50));
        list.add(new Student("section",100, 32));
        list.add(new Student("rohit",103, 37));

        StudentSortingAge ssa = new StudentSortingAge();
        Collections.sort(list, ssa);
        System.out.println(list);
    }
}
