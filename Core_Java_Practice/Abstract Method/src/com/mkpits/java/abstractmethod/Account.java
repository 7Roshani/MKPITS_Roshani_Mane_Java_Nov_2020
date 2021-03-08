package com.mkpits.java.abstractmethod;

abstract class Account
{
    int actno;
    float balance=1000;
    String str="";
    abstract void deposit(float amt);

    abstract void withdrawl(float amt);

    String showbalance()
    {
        str = "act no " + actno + "balance is " + balance;
        return str;
    }
}