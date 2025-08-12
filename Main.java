package com.comparable;


import  java.util.*; 
import  java.util.Random; 
import  java.util.Scanner; 
 class  Student  implements  Comparable<Student>{
       private  String  name;  
       private  int  age;
       private  int  height;
       public  Student(String  name,  int  age,  int  height)  {
               this.name  =  name;
               this.age  =  age;
               this.height  =  height;
        }       public  String  getName()  {
               return  name;
        }       public  void  setName(String  name)  {
               this.name  =  name;
        }       public  int  getAge()  {
               return  age;
        }       public  void  setAge(int  age)  {
               this.age  =  age;
        }       public  int  getHeight()  {
               return  height;
        }       public  void  setHeight(int  height)  {
               this.height  =  height;
        }       @Override       public  String  toString()  { 
              return  "Student{"  +  "name='"  +  name  +  '\''  + ",  age="  +  age  +  ",  height="  +  height  +  '}';
        }        
    @Override        
    public  int  compareTo(Student  o)  {
                return  o.name.compareTo (this.name);    //=>  25  -  45  =  -20
        }
 }
 public  class  Main  {
        public  static  void  main(String[]  args)  {
                List<Student>  list  =  new  ArrayList<>();
                list.add(new  Student("abhi",25,6));
                list.add(new  Student("superman",45,5)); 
                list.add(new  Student("ironman",35,7));
                list.add(new  Student("antman",65,4));
                list.add(new  Student("hulk",34,9)); //                1.  if  this  is  an  interface  then  we  have  implement  in  a  class  and  then  override  the  methods.
                Collections.sort(list);
                System.out.println(list);
        }
 }