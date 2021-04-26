package com.mkpits.java.abstractmethod;

class Current extends Account {
    void deposit(float amt) {
        balance = balance + amt;
    }

    void withdrawl(float amt) {
        balance = balance - amt;
    }
}