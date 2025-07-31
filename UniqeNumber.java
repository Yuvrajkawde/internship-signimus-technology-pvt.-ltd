package com.collectionn;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqeNumber {
    public static void main(String[] args) {
        // Original list with duplicates
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Use HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Convert back to ArrayList (optional)
        ArrayList<Integer> noDuplicates = new ArrayList<>(uniqueNumbers);

        System.out.println("List after removing duplicates: " + noDuplicates);
    }
}

