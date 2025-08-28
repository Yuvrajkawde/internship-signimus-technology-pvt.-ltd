package com.lamdaexpression;

import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {
        Consumer<Integer> consume = (num) ->
             System.out.println(num);


      consume.accept(7);
    }


}
