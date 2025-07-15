package com.string;

public class ReverseStringLogic {

    public static void main(String[] args) {

        String originalString = "YUVRAJ";
        String reverseString = "";

        for (int i= originalString.length()-1; i>=0 ; i--){
            reverseString = reverseString + originalString.charAt(i);
        }

        System.out.println("Original String was "+originalString);
        System.out.println("Reverse String is "+reverseString);


    }
}
