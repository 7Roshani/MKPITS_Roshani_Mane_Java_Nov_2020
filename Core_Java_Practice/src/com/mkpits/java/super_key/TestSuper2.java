package com.mkpits.java.super_key;

class Animal3 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog3 extends Animal3 {
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

class TestSuper2 {
    public static void main(String args[]) {
        Dog3 d = new Dog3();
        d.work();
    }
}

