package com.arrays;

public class ArrayWithoutUserInput {

    public static void main(String[] args) {

        int arr[][] =   {{1, 2, 3},
                        {4, 9, 6},
                        {7, 8, 9,}};

        System.out.println("Array Elements Are");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){

                System.out.print(arr[i][j]+", ");
            }
            System.out.print("\n");
        }
    }
}
