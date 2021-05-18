package com.mkpits.java.exception_propagation;

public class TestExceptionPropagation2 {
    void m() {
        try {
            throw new java.io.IOException("device error");//checked exception
        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    public static void main(String args[]) {
        TestExceptionPropagation2 obj = new TestExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }

}
