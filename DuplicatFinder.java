package com.collectionn;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatFinder {
    public static void main(String[] args) {
        // Create an ArrayList with some elements (including duplicates)
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grape");

        // HashSet to keep track of seen elements
        HashSet<String> seen = new HashSet<>();

        // HashSet to store duplicates
        HashSet<String> duplicates = new HashSet<>();

        for (String item : list) {
            // If item already seen, it's a duplicate
            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }

        // Print duplicate elements
        System.out.println("Duplicate elements:");
        for (String dup : duplicates) {
            System.out.println(dup);
        }
    }
}

