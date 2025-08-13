package com.comperator;


import java.util.*;

class Person{


    private String name;
    private int age;
    private int height;


    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     public void setHeight(int height) {
         this.height = height;
     }

     public int getHeight() {
         return height;
     }

     public Person(String name, int age, int height) {
         this.name = name;
         this.age = age;
         this.height = height;
     }

     @Override
     public String toString() {
         return "Person{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + '}';
     }
 }

 class SortPerson implements Comparator<Person>{

     @Override
     public int compare(Person o1, Person o2) {
         return o1.getAge() - o2.getAge() ;
     }
 }
 class SortPersonn implements Comparator<Person>{

     @Override
     public int compare(Person o1, Person o2) {
         return o2.getHeight()-o1.getHeight() ;
     }
 }

public class PersonMain {
    public static void main(String[] args) {
        List<Person> list  = new ArrayList<>();

        list.add(new Person("dhoni",38, 9));
        list.add(new Person("virat",35, 7));
        list.add(new Person("rohit",35, 8));
        list.add(new Person("yuvraj",32, 6));


        SortPerson sp = new SortPerson();
        SortPersonn sp1 = new SortPersonn();
        Collections.sort(list, sp.thenComparing(sp1));
        System.out.println(list);
    }
}
