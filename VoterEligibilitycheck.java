package com.controll_flow;

import java.util.Scanner;

public class VoterEligibilitycheck {


    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);

        
            System.out.println("enter your age ");
            int age = sc.nextInt();
            if (age<18){
                System.out.println("you are not eligible for voting");

            }else {
                System.out.println("you are  eligible for voting");
            }

    }

}
