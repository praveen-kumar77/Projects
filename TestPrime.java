package com.java;

public class TestPrime {
    public static void main(String[] args) {
        int check = 3;
        int prime = 0;
        if(check <= 1){
            System.out.println("its not a prime");
        }
        for(int i = 2; i <= check / 2; i++){
            if(check % i == 0){
                prime = 1;
            }
        }
        if(prime == 0){
            System.out.println("its prime");
        }
        else{
            System.out.println("its not a prime");
        }
    }
}
