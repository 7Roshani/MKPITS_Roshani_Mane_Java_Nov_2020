package com.mkpits.java.this_con;

public class A {

    A() {
        this(5);
        System.out.println("hello a");
    }

    A(int x) {
        System.out.println(x);
    }

}
