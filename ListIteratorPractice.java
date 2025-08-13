package com.iteratorr;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorPractice {
    public static void main(String[] args) {
        // Create LinkedList of city names
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Kolkata");
        cities.add("Chennai");

        // Create ListIterator
        ListIterator<String> listItr = cities.listIterator();

        System.out.println("Traversing Forward:");
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        System.out.println("\nTraversing Backward:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}

