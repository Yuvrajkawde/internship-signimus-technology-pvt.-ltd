package com.lamdaexpression;

import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {
        Function<String, String> func = (str) -> str;
        Function<String, Integer> func1 = (str) -> str.length();
        System.out.println(func.apply("yuvraj"));
        System.out.println(func1.apply("yuvraj"));
    }
}
