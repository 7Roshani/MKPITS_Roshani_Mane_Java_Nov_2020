package com.mkpits.java.PC;

public class A {
    int x;

    A() {
        this(10);
        x = 20;
        System.out.println("hello x = " + x); //20
    }

    A(int x) {

        System.out.println(x); //10
    }
}

class TestThis1 {
    public static void main(String args[]) {
        A a = new A();
    }
}
