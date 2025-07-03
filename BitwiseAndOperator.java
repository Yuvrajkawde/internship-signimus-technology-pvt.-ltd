package com.learn;

public class BitwiseAndOperator {


    public static void main(String[] args) {
        int a = 5;      //binary value  101
        int b = 4;      // 100


        int c = a&b;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(c);
    }
}
