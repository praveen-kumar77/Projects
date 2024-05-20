package com.java;

public class Fact {
    public static void main(String[] args) {
        int check = 10;
        double fact = 1;
        for(int i = 1; i <= check; i++){
             fact = fact * i;
        }
        System.out.println(fact);
    }
}
