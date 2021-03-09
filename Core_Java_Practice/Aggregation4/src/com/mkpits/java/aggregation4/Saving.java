package com.mkpits.java.aggregation4;

public class Saving extends Account {
    int interest = 200;

    //overriding the account class deposit  method
    void deposit(float amt) {
        balance = balance + amt + interest;
    }

}
