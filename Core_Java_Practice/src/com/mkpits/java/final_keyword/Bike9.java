package com.mkpits.java.final_keyword;

public class Bike9 {
    final int speedlimit;//final variable

    Bike9() {
        speedlimit = 20;
    }

    void run() {
        //speedlimit=400;
        System.out.println(speedlimit);
    }

    public static void main(String args[]) {
        Bike9 obj = new Bike9();
        obj.run();
    }

}
