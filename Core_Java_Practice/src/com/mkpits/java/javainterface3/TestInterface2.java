package com.mkpits.java.javainterface3;

public class TestInterface2 {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
    }

}
