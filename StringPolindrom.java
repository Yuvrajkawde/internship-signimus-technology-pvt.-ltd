package com.string;

import java.util.Scanner;

public class StringPolindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Check it is palindrom");
        String firstString = sc.next();
        String secondString = "";

        for (int i= firstString.length()-1; i>=0 ; i--){
            secondString = secondString + firstString.charAt(i);
        }

        if (firstString.equals(secondString)){
            System.out.println("given String is Palindrom");
        }else {
            System.out.println("given String is NOT Palindrom");
        }

    }
}
