package com.collectionn;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> llist = new LinkedList<>();
        llist.add(5);
        llist.add(1);
        llist.add(2);
        llist.add(0);
        llist.add(3);
        llist.add(4);
        System.out.println(llist);
        System.out.println(llist.stream().sorted().toList());

        System.out.println(llist.stream().sorted().toList().reversed());
        llist.remove(5);
        System.out.println(llist);
        for(int i=0; i<=llist.size()-1; i++){
            System.out.println("Index " + i +" value "+ llist.get(i));
        }
    }
}
