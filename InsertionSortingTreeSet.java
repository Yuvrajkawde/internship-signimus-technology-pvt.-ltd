package com.collectionn;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class InsertionSortingTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(1);
        set.add(0);

        System.out.println(set);
        for(int number:set){
            System.out.println(number);

        }
    }
}
