package com.mkpits.java.aggregationjavA;

public class circle {

    operation op;
    double pi = 3.14;

    double area(int r) {
        operation op = new operation();
        int sq = op.square(r);
        double ar = pi * sq;
        return ar;
    }

}
