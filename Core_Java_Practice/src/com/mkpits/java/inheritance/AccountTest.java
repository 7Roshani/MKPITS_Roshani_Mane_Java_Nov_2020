package com.mkpits.java.inheritance;

import java.util.Scanner;

public class AccountTest {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter account no");
        int ano = s1.nextInt();
        System.out.println("enter amount");
        float amt = s1.nextFloat();
        System.out.println("enter account type (saving or current)");
        String acttype = s1.next();
        System.out.println("enter deposit or withdrawl");
        String tran = s1.next();
        String result = "";
        if (acttype.equals("saving")) {
            Saving s = new Saving();
            s.actno = ano;
            if (tran.equals("deposit")) {
                s.deposit(amt);
            } else if (tran.equals("withdrawl")) {
                s.withdrawl(amt);
            }
            result = s.showbalance();
        } else if (acttype.equals("current")) {
            Current s = new Current();
            s.actno = ano;
            if (tran.equals("deposit")) {
                s.deposit(amt);
            } else if (tran.equals("withdrawl")) {
                s.withdrawl(amt);
            }
            result = s.showbalance();
        } else {
            System.out.println("invalid inputs");
        }
        System.out.println(result);

    }

}
