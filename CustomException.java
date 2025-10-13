package com.signimus.Student.Managment.Exceptions;



public class CustomException {
    public static class StudentNotFoundException extends RuntimeException{
        public StudentNotFoundException(String message){
            super(message);
        }

    }

    public class TeacherNotFoundException extends Throwable {
         public TeacherNotFoundException(String message){
                super(message);
            }
    }
}