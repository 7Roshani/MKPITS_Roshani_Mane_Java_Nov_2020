package com.mkpits.java.super_key;

class Animal1 {
    Animal1() {
        System.out.println("animal is created");
    }
}

class Dog1 extends Animal1 {
    Dog1() {
        super();
        System.out.println("dog is created");
    }
}

class TestSuper3 {
    public static void main(String args[]) {
        Dog1 d = new Dog1();
    }
}

