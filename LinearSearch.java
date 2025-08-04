package com.linearsearch;



public class LinearSearch {

    public int linearSearchAlgo(int [] arr, int target){

        for (int i=0; i<= arr.length-1; i++){

            if (target==arr[i]){
                return i;
            }

        }
            System.out.println("value not found");


        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {11,4,1,2,5,6,7,6,7,8,9};
        int target=8;
        LinearSearch lns = new LinearSearch();
        System.out.println(lns.linearSearchAlgo(arr, target));;

    }
}
