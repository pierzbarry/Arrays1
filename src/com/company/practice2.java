package com.company;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;


        System.out.println("Enter 10 elements: ");
        for(int i = 0; i < 10; i++){
            array[i] = scanner.nextInt();
            sum = sum + i;
        }

        int average = sum / 10;
        System.out.println("The average of the elements input by the user is: " + average);
    }
}
