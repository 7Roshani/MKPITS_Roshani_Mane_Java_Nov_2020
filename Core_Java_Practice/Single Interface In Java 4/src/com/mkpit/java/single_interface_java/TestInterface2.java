package com.mkpit.java.single_interface_java;

class TestInterface2 {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}
