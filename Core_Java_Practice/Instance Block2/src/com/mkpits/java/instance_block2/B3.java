package com.mkpits.java.instance_block2;

public class B3 extends A {
    B3() {
        super();
        System.out.println("child class constructor invoked");
        System.out.println("n=" + n);
    }

    B3(int a) {
        super();
        System.out.println("child class constructor invoked " + a);
        System.out.println("n=" + n);
    }

    {
        System.out.println("instance initializer block is invoked");
        n = n + 1;
    }

    public static void main(String args[]) {
        B3 b1 = new B3();
        B3 b2 = new B3(10);
    }
}
