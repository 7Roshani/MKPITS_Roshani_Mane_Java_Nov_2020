package com.mkpits.java.exception_handling_method_overriding;

import java.io.IOException;

public class TestExceptionChild extends Parent{
    void msg()throws IOException {
        System.out.println("TestExceptionChild");
    }
    public static void main(String args[]) throws IOException {
        Parent p=new TestExceptionChild();
        p.msg();
    }

}
