package com.lamdaexpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Add {


    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("grapps");
        fruit.add("mango");
        fruit.add("banana");

        Collections.sort(fruit,(a,b) -> a.compareTo(b));
        System.out.println(fruit);
    }

}

