package com.collectionn;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer , String>  hmap = new HashMap<>();
        hmap.put(100, "rohan");
        hmap.put(101, "jingi");
        hmap.put(102, "dhoni");
        hmap.put(103, "sachin");
        System.out.println("All Student Details:");
        for(Map.Entry<Integer,String> entry:hmap.entrySet()){
            System.out.println("rollNo " + entry.getKey() +" Name :" + entry.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the roll no.");
        int rollNo = sc.nextInt();
        if(hmap.containsKey(rollNo)){
            System.out.println("Hello " +hmap.get(rollNo));
        }else {
            System.out.println("record not found for given roll number");
        }
    }
}
