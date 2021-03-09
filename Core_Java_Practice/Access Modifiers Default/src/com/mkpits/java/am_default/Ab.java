package com.mkpits.java.am_default;

public class Ab {
    int a = 20;

    void msg() {
        System.out.println("Hello" + a);
    }

    public void showmsg() {
        a = 40;
        msg();
    }

}
