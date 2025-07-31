package com.collectionn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Convert to lowercase and split into words
        String[] words = sentence.toLowerCase().split("\\s+");

        // HashMap to store word and its frequency
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count frequency
        for (String word : words) {
            // Remove punctuation (optional)
            word = word.replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Display results
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        scanner.close();
    }
}

