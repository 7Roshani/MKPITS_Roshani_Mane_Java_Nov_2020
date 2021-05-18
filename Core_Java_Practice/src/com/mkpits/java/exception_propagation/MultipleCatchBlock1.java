package com.mkpits.java.exception_propagation;

public class MultipleCatchBlock1 {
    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {

        n();

    }

    public static void main(String args[]) {
        MultipleCatchBlock1 obj = new MultipleCatchBlock1();
        try {
            obj.p();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("normal flow...");
    }


}
