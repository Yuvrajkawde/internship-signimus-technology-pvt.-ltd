package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;


public class ArraySort {

    public static void main(String[] args) {

        int [] arr = {55,5,90,10,20,40,30,60,50};

        int max = arr[0];
        int min = arr[0];

        for (int i=1 ; i< arr.length; i++){
            if (arr[i] > max){
                max=arr[i];
            }

            if (arr[i]< min){
                min=arr[i];
            }
        }
        System.out.println("max :" + max);
        System.out.println("min :" + min);

    }
}
