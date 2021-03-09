package com.mkpits.java.overriden_no;

public class Bank {
    static int roi = 2;

    int getRateOfInterest() {
        return 0;
    }

    static void showroi() {
        System.out.println("roi from static method : " + roi);
    }

}
