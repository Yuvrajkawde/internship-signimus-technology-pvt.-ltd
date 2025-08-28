package com.lamdaexpression;

import java.util.function.Supplier;


public class SupplyerInterface {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "this is supplier";
        System.out.println( supplier.get());;
    }
}
