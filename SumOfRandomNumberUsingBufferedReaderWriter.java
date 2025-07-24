package com.IOStreamExample;

import java.io.*;
import java.util.Random;
public class SumOfRandomNumberUsingBufferedReaderWriter {





        public static void main(String[] args) {

            int numberCount = 10; // how many random numbers to write

            // Step 1: Write random numbers to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter( "numbers.txt"))) {
                Random rand = new Random();
                for (int i = 0; i < numberCount; i++) {
                    int randomNum = rand.nextInt(100); // numbers between 0 and 99
                    writer.write(String.valueOf(randomNum));
                    writer.newLine(); // write each number on a new line
                }
                System.out.println("Random numbers written to " +  "numbers.txt");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

            // Step 2: Read the file and calculate the sum
            int sum = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader( "numbers.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    try {
                        int number = Integer.parseInt(line);
                        sum += number;
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid line: " + line);
                    }
                }
                System.out.println("Sum of numbers in file: " + sum);
            } catch (IOException e) {
                System.out.println("Error reading from file: " + e.getMessage());
            }
        }
    }



