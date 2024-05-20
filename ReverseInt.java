package com.java;
import java.util.Scanner;


public class ReverseInt {
    public static void main(String[] args) {
        /*Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number you want be reverse : ");
        int reverse = obj.nextInt();
        String r = Integer.toString(reverse);
        String c = "";

        if(r.contains("-")) {
            for (int i = 1; i < r.length(); i++) {
                c = r.charAt(i) + c;
            }
            System.out.println(r.charAt(0)+c);
        }
        else {
            for (int i = 0; i < r.length(); i++) {
                c = r.charAt(i) + c;
            }
            System.out.println(c);
        }*/

        int n = 23445;
        String t = Integer.toString(n);
        int rev = 0;
        for(int i = 0; i <= t.length() - 1; i++){
            if(n > 0){
                rev = rev * 10 + n % 10;
                n = n / 10;
            }
            else{
                System.out.println(rev);
                break;
            }
        }
        System.out.println(rev);

    }
}