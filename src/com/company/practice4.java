package com.company;

public class practice4 {
    public static void main(String[] args) {
        String [] names = {"Pierz", "Phoebe", "Priscilla"};

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names); {
            System.out.println("name");
        }
    }
}
