package com.binarysearch;

public class BinarySearchAlgo {

    public int findN0(int []arr,int  target){

        int low = 0;
        int high = arr.length-1;



        while (low<high){

            int mid = (low + high)/2;
            if (arr[mid] == target){

                return mid;
            }
            else if (arr[mid] < target){

                low = mid + 1;

            }

            else if (arr[mid] >  target){

                high = mid - 1;

            }
        }
        return -1;

    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target=8;
        BinarySearchAlgo bsa = new BinarySearchAlgo();
        System.out.println(bsa.findN0(arr,target));



    }
}
