package com.string;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        String s1 = "anagram";
        String s2 = "ragaman";

        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (c1.length != c2.length){
            System.out.println("not an anagram");
            System.exit(0);

        }
        for (int i = 0; i< c1.length; i++){
            if (c1[i] != c2[i]) {
                System.out.println("not anagram");
                System.exit(0);
            }

        }
        System.out.println("Given String is Anagram");
    }
}
