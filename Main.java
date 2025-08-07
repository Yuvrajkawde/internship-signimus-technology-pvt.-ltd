package com.memberclass;



import java.io.*;


interface Shape{
    public double calculateArea();
}
abstract class Rectangle implements Shape{
    protected int width;
    protected int height;

    //    constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    static class Circle implements Shape {
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }
        @Override
        public double calculateArea() {
            return 3.141 * radius * radius;
        }
    }
}

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Rectangle rectangle = new Rectangle(5,10) {
            @Override
            public double calculateArea() {
                return width * height;
            }
        };

        Rectangle.Circle circle = new Rectangle.Circle(23.2);

        System.out.println("Rectangle: "+ rectangle.calculateArea());
        System.out.println("Circle: "+ circle.calculateArea());
    }

}
