package com.mkpits.java.string_buffer;

import java.util.Scanner;

public class Stringex4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String fn = sc.next();
        StringBuffer sb = new StringBuffer(fn);
        System.out.println("enter your lname");
        String ln = sc.next();
        sb.insert(5, ln);//now original string is changed
        System.out.println(sb);//prints HJavaello


    }

}
