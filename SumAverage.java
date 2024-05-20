package com.java;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the marks :");
        int mark1 = obj.nextInt();
        int mark2 = obj.nextInt();
        int mark3 = obj.nextInt();
        int mark4 = obj.nextInt();
        int mark5 = obj.nextInt();
        int[] number = {mark1, mark2, mark3, mark4, mark5};
        int sum = 0;
        float average = 0;
        for(int i = 0; i <= number.length - 1; i++){
            sum = sum + number[i];
            average = (float) sum / number.length;
        }
        System.out.println("Sum of the marks :"+sum);
        System.out.println("Average of marks :"+average);
    }
}
