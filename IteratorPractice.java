package com.iteratorr;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        // Create ArrayList of student names
        ArrayList<String> students = new ArrayList<>();
        students.add("Ankit");
        students.add("Rahul");
        students.add("Aman");
        students.add("Sneha");
        students.add("Priya");

        System.out.println("All Student Names:");
        Iterator<String> itr = students.iterator();

        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }

        // Removing students whose names start with "A"
        itr = students.iterator(); // Reseting iterator
        while (itr.hasNext()) {
            String name = itr.next();
            if (name.startsWith("A")) {
                itr.remove(); // Safe removal using Iterator
            }
        }

        System.out.println("\nAfter removing names starting with 'A':");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
