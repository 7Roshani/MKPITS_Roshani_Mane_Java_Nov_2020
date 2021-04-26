package com.mkpits.java.am_default;

import java.util.Scanner;

public class testbank {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount to deposit");
        int amount=s.nextInt();
        Account act=new Account();
//act.bal=500; since bal is default
        String str=act.deposit(amount);
        System.out.println(str);
    }

}
