package com.mkpits.java.super_key;

class Animal2 {
    Animal2() {
        System.out.println("animal is created");
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        System.out.println("dog is created");
    }
}

class TestSuper4 {
    public static void main(String args[]) {
        Dog2 d = new Dog2();
    }
}

