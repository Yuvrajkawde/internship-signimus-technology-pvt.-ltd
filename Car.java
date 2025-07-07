package com.controll_flow;
//Create a Car class with attributes like brand, color, and speed and methods like start(), stop(), and accelerate().
//Instantiate objects of the Car class and call its methods in the main() method. 4/7/25
public class Car {

    String brand = "Honda";
    String color = "white";
    String speed = "30km/pl";

    public void start(){
        System.out.println("car with color : " + color +",  brand :" + brand + " , speed : " + speed+ " started");
    }
    public void stop(String brand, String color, String speed){
        System.out.println("car with color : " + color +",  brand :" + brand + " , speed : " + speed+ " stopped");
    }

    public void accelerate(){
        System.out.println("Car accelerated");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop("suzuki","red","32kmpl");
        car.accelerate();
    }

}
