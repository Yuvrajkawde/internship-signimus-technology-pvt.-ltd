package com.learn;

public class BitwiseNotOperator {


    public static void main(String[] args) {
      int a=5;
      int c = ~a; // "~" is used to inverse the binary value,  if 0 then 1, if 1 then 0
        System.out.println(Integer.toBinaryString(a));// 00000000  00000000  00000000   00000101 =32
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));//11111111    11111111    11111111    11111010
    }
}
