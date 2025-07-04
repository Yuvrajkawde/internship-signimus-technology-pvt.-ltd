package com.controll_flow;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int   randomNumber = random.nextInt(5);
        System.out.println(randomNumber);

        while(true) {
        System.out.println("enter the number");
        int guessNumber = scan.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("you won");
                break;
            } else {
                System.out.println("you lost");
            }
        }

    }
}
