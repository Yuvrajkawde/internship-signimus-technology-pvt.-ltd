package com.selectionsort;

import java.util.Arrays;

public class Main {


    public static void main(String... args) {

        int[] A = {6, 8, 3, 2, 9, 7, 4};
        //         0, 1, 2, 3, 4, 5, 6
        for (int i = 0; i < A.length; i++) {
            int minInd = i; // i = 0 => 2 => 3
            for (int j = i + 1; j < A.length; j++) {
                if (A[minInd] > A[j]) { //2 > 2
                    minInd = j;
                }
            }
            int temp = A[i];
            A[i]=A[minInd];
            A[minInd] = temp;
        }

        System.out.println(Arrays.toString(A));
    }


}

