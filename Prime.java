package com.java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter a number :");
        int check = get.nextInt();
        int prime = 0;

        if(check <= 1){
            System.out.println("not a prime");
        }
        for(int i = 2; i <= check / 2; i++){
            if(check % 2 == 0){
                prime += 1;
                System.out.println("it's not a prime number");
                break;
            }
        }
        if(prime == 0){
            System.out.println("prime");
        }


        }
}

