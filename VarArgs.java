package com;

public class VarArgs {



    public static  void add(int... args){
        int sum=0;
        for (int i : args){
            sum = sum +i;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        VarArgs.add(1,2,3,4,5);
    }
}
