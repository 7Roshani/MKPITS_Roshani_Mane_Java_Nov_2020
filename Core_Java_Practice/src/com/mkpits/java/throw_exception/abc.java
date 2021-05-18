package com.mkpits.java.throw_exception;

public class abc {
    public static void main(String[] args)
    {
        FinalizeExample f1=new FinalizeExample();
        FinalizeExample f2=new FinalizeExample();
        f1=null;
        f2=null;
        System.gc();
    }

}
