package com.company;

public class practice6 {
    public static void main(String[] args) {
        int[] values = {2, 5, 9, 0, 2, 1, 8, 5, 4};

            for(int i = 0; i < values.length; i++) {
                if(i == 5) {
                    System.out.println(values[i]);
                } else break;
            }
    }
}
