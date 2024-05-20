package com.java;

import java.util.Scanner;

public class LastLength {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string you looking for :");
        String name = obj.nextLine();
        String c = "";
        for(int i = name.length() - 1; i >= 0; i--){
            if(name.charAt(i) == ' '){
                if(c.length() == 0){
                    continue;
                }
                else{
                    break;
                }
            }
            else{
                c += name.charAt(i);
            }
        }
        System.out.println(c.length());
    }
}
