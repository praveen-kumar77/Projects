package com.java;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 5, 7};
        int sum = 16;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(i+","+(j));
                    break;
                }
            }
        }
    }
}
