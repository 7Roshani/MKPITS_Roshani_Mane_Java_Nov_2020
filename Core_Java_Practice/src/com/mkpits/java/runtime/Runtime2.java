package com.mkpits.java.runtime;

public class Runtime2 {
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("shutdown -s -t 0");
    }

}
