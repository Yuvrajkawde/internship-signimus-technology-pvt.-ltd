package com.lamdaexpression;

import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class EvenNumber {
  
        
    public static void main(String[] args) {
        Predicate<Integer> isEven  = (number)-> number%2==0;
        int a=10;
        int b = 3;
        System.out.println(a +" isEven ? "+ isEven.test(a));
        System.out.println(b +" isEven ? "+ isEven.test(b));
    }
}
