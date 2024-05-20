package com.java;

public class Palindrome {
    public static boolean checkPali() {
        int x = 891;
        String r = Integer.toString(x);
        String c = "";
        for(int i = 0; i < r.length(); i++){
            c = r.charAt(i) + c;
        }
        if (c.equals(r)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPali());
    }

}
