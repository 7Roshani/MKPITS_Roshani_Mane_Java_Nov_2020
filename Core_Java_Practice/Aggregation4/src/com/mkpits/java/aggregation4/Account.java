package com.mkpits.java.aggregation4;

public class Account {
    int actno;
    float balance = 1000;
    String str = "";

    void deposit(float amt) {
        balance = balance + amt;
    }

    void withdrawl(float amt) {
        balance = balance - amt;
    }

    String showbalance() {
        str = "act no " + actno + "balance is " + balance;
        return str;
    }

}
