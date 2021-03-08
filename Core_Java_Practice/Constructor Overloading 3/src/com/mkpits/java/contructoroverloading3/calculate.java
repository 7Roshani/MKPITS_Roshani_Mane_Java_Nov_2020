package com.mkpits.java.contructoroverloading3;

public class calculate {
    public int addition(int n1, int n2) {
        return n1 + n2;
    }

    //overloading the addition method with 2 float parameters
    public float addition(float n1, float n2) {
        return n1 + n2;
    }

    public static void main(String[] arg) {
        calculate c = new calculate();
        int r = c.addition(2, 3);
        System.out.println("addition of 2 int " + r);
        float r1 = c.addition(2.2f, 3.3f);
        System.out.println("addition of 2 float " + r1);

    }
}
