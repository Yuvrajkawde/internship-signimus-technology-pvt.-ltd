package com.IOStreamExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    public static int countWordsInFile(String filePath) throws IOException {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split line into words using whitespace as delimiter
                String[] words = line.trim().split("\\s+");

                // Skip empty lines
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String filePath = "sample.txt"; // Change this to your file path

        try {
            int totalWords = countWordsInFile(filePath);
            System.out.println("Total number of words in the file: " + totalWords);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

