package com.generics;

class Box<T>{
    public <T> void print(T data){
        System.out.println(data);
    }

    public <T extends Number> void printInt(T a, T b){
        System.out.println(a.intValue() + b.intValue());
    }
}
public class GenericsMain {

    public static void main(String[] args) {
        Box<String> box = new Box();
        box.print("yuvraj");
        Box<Integer> box1 = new Box();
        box1.printInt(5,7);

    }
}
