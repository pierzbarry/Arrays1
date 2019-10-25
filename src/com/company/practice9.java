package com.company;

public class practice9 {
    public static void main(String[] args) {
        int[] firstArray = {1, 7, 6, 5 ,9};
        int[] secondArray ={2, 7, 6, 1, 4};
        int[] thirdArray ={1, 7, 3, 2, 6};

        for(int i = 0; i < firstArray.length; i++){
            for(int x = 0; x < secondArray.length; x++){
                for(int k = 0; k < thirdArray.length; k++)
                if((firstArray[i] == secondArray[x]) && (firstArray[i] == thirdArray[k])){
                    System.out.println("(" + firstArray[i] + "," + secondArray[x] + "," + thirdArray[k] + ")");
                }
            }
        }
    }
}