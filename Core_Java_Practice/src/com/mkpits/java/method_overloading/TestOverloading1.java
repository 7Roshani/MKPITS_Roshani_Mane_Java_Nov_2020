package com.mkpits.java.method_overloading;

import com.mkpits.java.method_overloading1.AAdder;

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(AAdder.add(11, 11));
        System.out.println(AAdder.add(11, 11, 11));
    }

}
