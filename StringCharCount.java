package com.string;

public class StringCharCount {

    public static void main(String[] args) {
        String str = "programming";
        char target = 'g';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Character '" + target + "' occurs " + count + " time(s).");
    }
}
