package com.company;

public class practice {
    public static void main(String[] args) {
        int[] scores = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 10};
        int sum = 0;

        for (int num : scores) {
            sum = sum + num;
        }
        System.out.println("Sum of the array elements is: " + sum);
    }
}