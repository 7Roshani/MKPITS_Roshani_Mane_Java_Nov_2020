package com.mkpits.java.am_overriding;

// The default modifier is more restrictive than protected. That is why, there is a compile-time error.
class A{
    protected void msg(){System.out.println("Hello java");}
}

public class Simple extends A{
    void msg(){System.out.println("Hello java");}//C.T.Error
    public static void main(String args[]){
        Simple obj=new Simple();
        obj.msg();
    }
}

