package com.mkpits.java.super_key1;

public class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {

        System.out.println(super.color);//prints color of Animal class
    }

}
