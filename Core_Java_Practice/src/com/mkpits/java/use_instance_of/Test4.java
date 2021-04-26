package com.mkpits.java.use_instance_of;

public class Test4 {
    public static void main(String args[]) {
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }

}
