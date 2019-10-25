package com.company;

public class practice8 {
    public static void main(String[] args) {
        String [] words = {"w", "t", "y", "h", "k"};
        for(int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("t")) {
                words[i] = "hello";
            }
            System.out.println(words[i]);
        }
    }
}
