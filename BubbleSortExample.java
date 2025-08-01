package com.collectionn;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 3};

        for(int i = 0; i<a.length; i++){
            for (int j=1; j<a.length; j++){

                if (a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                System.out.println(j);
            }


        }
        System.out.println(Arrays.toString(a));
    }
}

