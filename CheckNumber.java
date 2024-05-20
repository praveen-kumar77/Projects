package com.java;

public class CheckNumber {
    public static void main(String[] args) {
        int[] arr = {12, 13, 15, 16, 24, 26, 27, 29, 34, 36, 56, 67, 70};
        int check = 14;
        int find = findNumber(arr, check);
        if(find == 0){
            System.out.println("The number is not in the list");
        }
        else{
            System.out.println("the is present in the list");
        }
    }

    private static int findNumber(int[] arr, int check) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        for(int i = 0; i <= end; i++){
            if(check == arr[mid]){
                return 1;
            }
            else if(check > arr[mid]){
                start = mid + 1;
            }
            else if(check < arr[mid]) {
                end = mid - 1;
            }
            mid = (start + end) / 2;

        }
        return 0;
    }
}
