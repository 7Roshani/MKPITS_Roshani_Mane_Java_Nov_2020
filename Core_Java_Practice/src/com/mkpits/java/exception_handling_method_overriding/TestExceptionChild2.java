package com.mkpits.java.exception_handling_method_overriding;

public class TestExceptionChild2 extends Parent1 {
    void msg() throws Exception {
        System.out.println("child");
    }

    public static void main(String args[]) {
        Parent1 p = new TestExceptionChild2();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }

}
