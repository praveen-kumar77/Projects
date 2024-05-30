package com.java;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 21, 56, 32, 55, 3};
        int n = arr.length - 1;
        int temp;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr) + "j");
    }
}
