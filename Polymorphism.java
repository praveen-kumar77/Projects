package com.java;

public class Polymorphism {
    public void checking1(){
        System.out.println("this is polymorphism class");
    }
    public void checking1(int a){
        System.out.println("this is polymorphism class");
    }
}
class Poly extends Polymorphism{
    public void checking1(){
        System.out.println("this is second poly");
    }
            }

class Poly2 extends Polymorphism{
    public static void main(String[] args) {
        Polymorphism obj;
        obj = new Polymorphism();
        obj.checking1();
        obj = new Poly();
        obj.checking1();
    }
}