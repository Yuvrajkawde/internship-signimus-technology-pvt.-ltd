package com.learn;

public class BitwiseXorOperator {


    public static void main(String[] args) {
        int a = 4;      //binary value  100
        int b = 7;      // 111
         int d = 3;
//
        int c = a ^ b;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println(c);
        //    1      ^      1        =    0
         //    0      ^      1        =    1
    }   //      0      ^      1        =     1,        011 = 3
}
