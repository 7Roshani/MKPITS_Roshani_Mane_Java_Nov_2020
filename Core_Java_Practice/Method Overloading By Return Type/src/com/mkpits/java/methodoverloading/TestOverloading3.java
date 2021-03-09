package com.mkpits.java.methodoverloading;

//Out put will be method add(int,int) is already defined in class Adder

public class TestOverloading3 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));//ambiguity
    }

}
