package com.mkpits.java.am_default;

public class test {
    public static void main(String[] arg) {
        Ab ex = new Ab();
        //ex.a=40; error since a is default
        // ex.msg();
        ex.showmsg();
    }
}

class Account {

    int bal = 1000; //default access modifier

    public String deposit(int amt) {
        bal = bal + amt;
        return "amount deposited , bal is " + bal;
    }

}
