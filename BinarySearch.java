package com.java;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(check());
    }
    public static String check() {
        int[] numberList = {7, 8, 11, 12, 15, 18, 20, 21, 23, 30, 44};
        int startIndex = 0;
        int endIndex = numberList.length - 1;
        int check = 21;
        int middle = (startIndex + endIndex) / 2;
        for (int i = 0; i <= numberList.length - 1; i++) {
            if (numberList[middle] == check) {
                return "the number is in the list";
            } else if (check > numberList[middle]) {
                startIndex = middle + 1;
                middle = (startIndex + endIndex) / 2;
            } else if (check < numberList[middle]) {
                endIndex = middle - 1;
                middle = (startIndex + endIndex) / 2;
            }
        }
        return "the number is not in the list";
    }
}
