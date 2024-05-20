package com.java;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {6,2,4,7,9,44,53,12,11};
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        System.out.println(checkSecmin(arr, min, smin));

    }
    private static int checkSecmin(int[] arr, int min, int smin) {
        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] < min){
                smin = min;
                min = arr[i];
            } else if (arr[i] < smin) {
                smin = arr[i];

            }
        }
        return smin;
    }
}
