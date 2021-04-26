package com.mkpits.java.this_key1;

public class A {
    A() {
        System.out.println("hello a");
    }

    A(int x) {
        this();
        System.out.println(x);
    }

}
