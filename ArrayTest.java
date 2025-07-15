package com.arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        int average = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            sum = sum + num[i];
            average = sum / num.length - 1;

        }
        System.out.println("sum is     :" + sum);
        System.out.println("average is :" + average);
    }
}
