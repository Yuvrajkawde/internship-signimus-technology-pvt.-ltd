package com.leetcode;

public class Solution {



    public int solve(int arr[], int target){

        for (int i=0; i< arr.length; i++){

            for (int j = i+1; j<arr.length; j++ ){
                if (arr[i]+arr[j] == target){
                    System.out.println(i+" "+j); ;
                }
            }
        }


        return target;
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 12, 9};
        int target = 9;
        Solution solution = new Solution();
        solution.solve(arr, target);
    }
}
