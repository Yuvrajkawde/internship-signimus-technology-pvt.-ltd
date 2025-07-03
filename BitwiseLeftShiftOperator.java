package com.learn;

public class BitwiseLeftShiftOperator {


    public static void main(String[] args) {
        int a = 5;      //binary value  101



        int c = a << 1; // 00000000  00000000  00000000   00000101 it will shift this binary code  left for 1 time  so 101 will be  1010
        System.out.println(Integer.toBinaryString(a));

        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));

    }
}
