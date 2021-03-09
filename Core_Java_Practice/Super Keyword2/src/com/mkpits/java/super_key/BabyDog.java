package com.mkpits.java.super_key;

public class BabyDog extends Dog {
    String color = "brown";

    void printColor1() {

        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
        printColor();
    }
}
