package com.lamdaexpression;

import java.util.Comparator;

public class LamdaUsingComparator {
    public static void main(String[] args) {

        Comparator<String> comp = ( s1,  s2)-> s1.compareTo(s2) ;


        System.out.println(comp.compare("yuvraj", "yuvra"));

    }
}
