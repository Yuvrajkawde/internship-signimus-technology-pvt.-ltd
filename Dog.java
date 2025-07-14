package com.polymorphysmm;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("woof!");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
