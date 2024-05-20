package com.java;

public class PerfectNumber {
    public static void main(String[] args) {
        boolean check = perfectNumber(6);
        if (check) {
            System.out.println("it's a perfect number");
        } else {
            System.out.println("it's not a perfect number");
        }
    }

    private static boolean perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return n == sum;
    }
}
