package com.IOStreamExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLine {




        public static void main(String[] args) {
            String filePath = "sample.txt";  // Change this to your file path
            int lineCount = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                while (br.readLine() != null) {
                    lineCount++;
                }
                System.out.println("Total number of lines: " + lineCount);
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }



