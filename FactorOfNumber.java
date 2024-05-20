package com.java;

public class FactorOfNumber {
    public static void main(String[] args) {
        int number = 72;
        for( int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
