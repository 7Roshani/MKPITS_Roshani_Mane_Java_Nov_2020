package com.mkpits.java.throw_exception;

import java.io.IOException;

public class Testthrows3 {
    public static void main(String args[])throws IOException {//declare exception
        MM m=new MM();
        m.method();

        System.out.println("normal flow...");
    }

}
