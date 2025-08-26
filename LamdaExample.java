package com.lamdaexpression;

public class LamdaExample {
    public static void main(String[] args) {



        Runnable runnable = ()-> System.out.println(10%2==0);


        runnable.run();
    }
}
