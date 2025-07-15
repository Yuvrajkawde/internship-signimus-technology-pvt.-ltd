package com.arrays;

import java.util.Scanner;

public class Array2D {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  arr [][] = new int[3][3];
        System.out.println("Enter Array Elements ");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){

                arr[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }

        System.out.println("Array Elements Are");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){

                System.out.print(arr[i][j]+", ");
            }
            System.out.print("\n");
        }
    }
}
