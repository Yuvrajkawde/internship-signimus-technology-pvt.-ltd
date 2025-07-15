package com.arrays;

import java.util.Arrays;

public class ArraysortByMethod {

    public static void main(String[] args) {


        int [] arr = {55,5,90,10,20,40,30,60,50};
        Arrays.sort(arr);
        System.out.println("sorted : " + Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}
