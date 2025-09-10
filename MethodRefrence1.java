package com.method_refrence;

import java.util.function.BiFunction;

class Calculator{

    public Calculator(){

    }

    public int add(int a, int b){

        return a+b;
    }
}

public class MethodRefrence1 {
    public static void main(String[] args){
//        BiFunction<Integer,Integer,Integer> biFun = (a,b)-> Math.max(a,b);

//        Predicate<Integer> predicate = (a)-> Calculator.isEven(a);

        Calculator cal = new Calculator();

        BiFunction<Integer, Integer, Integer> fun = cal::add;

        System.out.println("this is sum: "+fun.apply(5,6));
    }
}

