package com.java;

import java.util.Arrays;

public class OddFind {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int add = 0;
        for(int i = 1; i < arr.length; i += 2){
            arr[i] = add;
            add++;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
