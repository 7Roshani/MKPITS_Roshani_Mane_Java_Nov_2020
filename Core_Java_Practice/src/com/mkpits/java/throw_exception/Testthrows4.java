package com.mkpits.java.throw_exception;

import java.io.IOException;

public class Testthrows4 {
    public static void main(String args[])throws IOException {//declare exception
        MMM m=new MMM();
        m.method();

        System.out.println("normal flow...");
    }

}
