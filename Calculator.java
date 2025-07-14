package com.interfaces;

public class Calculator {

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);

    }

    public void addString(String a, String b){
        System.out.println(a.concat(b));
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(23,32);
        cal.add(12,32,1);
        cal.addString("yuvraj", "KAWDE");
    }
}
