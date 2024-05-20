package com.java;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class LastPlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9};
        /*ArrayList<Integer> arr2 = new ArrayList<>();
        String get = "";
        for(int i = 0; i < arr.length; i++){
            get += arr[i];
        }
        int r = 0;
        for(int i = 0; i < get.length(); i++){
            int c = get.charAt(i);
            int c2 = c - 48;
            r = (r * 10) + c2;
        }
        int add2 = r + 1;
        String newStr = Integer.toString(add2);
        for(int i = 0; i < newStr.length(); i++){
            int s = newStr.charAt(i) - 48;
            arr2.add(i, s);
        }
        int[] newArray = new int[arr2.size()];
        for(int i = 0; i < arr2.size(); i++){
            newArray[i] = arr2.get(i);
        }
        System.out.println(newArray);*/
        System.out.println(Arrays.toString(lastLength(arr)));
    }
    private static int[] lastLength(int[] arr){
        for(int i = arr.length - 1; i >= 0; i-- ){
            if(arr[i] < 9){
                arr[i] += 1;
                return  arr;
            }
            if(arr[i] > 8){
                arr[i] = 0;
            }
        }
        int[] arr2 = new int[arr.length + 1];
        arr2[0] = 1;
        return arr2;
    }
}
