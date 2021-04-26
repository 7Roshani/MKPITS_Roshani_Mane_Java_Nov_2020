package com.mkpits.java.constructoroverloading;

public class calculate {
    public int addition(int n1, int n2) {
        return n1 + n2;
    }

    //overloading the addition method with 3 integer parameters
    public int addition(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static void main(String[] arg) {
        calculate c = new calculate();
        int r = c.addition(2, 3);
        System.out.println("addition of 2 int " + r);
        int r1 = c.addition(2, 3, 4);
        System.out.println("addition of 3 int " + r1);

    }
}
