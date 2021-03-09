package com.mkpits.java.blank_final_variable;

public class Bike10 {
    final int speedlimit;//blank final variable

    Bike10() {
        speedlimit = 70;
        System.out.println(speedlimit);
    }

    public static void main(String args[]) {
        new Bike10();
    }

}
