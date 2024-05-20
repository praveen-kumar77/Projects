package com.java;

public class ReverseName {
    public static void main(String[] args) {
        String name = "prakash kannan";
        String reverseName = "";
        for(int i = 0; i < name.length() ; i++){
            char single = name.charAt(i);
            reverseName = single + reverseName;
        }
        System.out.println(reverseName);
    }
}
