package com.java;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 21, 56, 32, 55, 3};
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
