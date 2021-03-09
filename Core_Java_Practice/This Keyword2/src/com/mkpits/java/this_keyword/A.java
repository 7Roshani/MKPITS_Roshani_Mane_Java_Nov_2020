package com.mkpits.java.this_keyword;

public class A {

    int x;

    A() {
        x = 20;
        System.out.println("hello x = " + x); //20
    }

    A(int x) {
        this();
        System.out.println(this.x); //20
    }
}

class TestThis1 {
    public static void main(String args[]) {
        A a = new A(10);
    }
}
