package com.method_refrence;

import java.util.function.BiFunction;
import java.util.function.Function;

class Calculatorr {

    public Calculatorr() {
    }

    public Calculatorr(String s) {
        System.out.println("Constructor called with: " + s);
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    public int add(int a, int b) {
        return a + b;
    }
}

public class MethodRefrence2 {
    public static void main(String[] args) {

        // Constructor reference
        Function<String, Calculatorr> fun = Calculatorr::new;
        Calculatorr cal1 = fun.apply("Rohit");

        // Correct BiFunction (must return Integer, not String)
        BiFunction<Integer, Integer, Integer> bifun = cal1::add;

        System.out.println("Sum = " + bifun.apply(25, 25));
    }
}
