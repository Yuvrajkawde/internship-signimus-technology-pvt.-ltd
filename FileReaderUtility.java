package com.IOStreamExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtility {

    // Read entire file content as a single String
    public static String readFileAsString(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }

        return content.toString();
    }



    // Main method to test the utility
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Change this to your file path

        try {
            System.out.println("=== Entire File Content ===");
            System.out.println(readFileAsString(filePath));



        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

