package com.mkpits.java.abstractmethod;

class Saving extends Account
{
    int interest = 200;
    //overriding the account class deposit  method
    void deposit(float amt)
    {
        balance=balance + amt + interest;
    }
    void withdrawl(float amt)
    {
        balance=balance - amt ;
    }


}