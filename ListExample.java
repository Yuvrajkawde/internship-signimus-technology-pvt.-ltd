package com.collectionn;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(3);
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(0,0);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.get(8));

        System.out.println(list.hashCode());
        System.out.println(list.get(4).hashCode());
        System.out.println(list.contains(9));
        list.clear();
        System.out.println(list);

    }
}
