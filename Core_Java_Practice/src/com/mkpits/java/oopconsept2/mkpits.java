package com.mkpits.java.oopconsept2;

import java.util.Scanner;

public class mkpits {
    public static void main(String[] arg) {

        Scanner s1 = new Scanner(System.in);
        employee emp = new employee();
        System.out.println("enter employee no");
        int en = s1.nextInt();
        System.out.println("enter emp name ");
        String ename = s1.next();
        System.out.println("enter emp deisgnation ");
        String ed = s1.next();
        System.out.println("enter emp salary ");
        float sa = s1.nextFloat();
        emp.getdata(en, ename, ed, sa);
        emp.showdata();

        employee emp1 = new employee();
        System.out.println("enter employee no");
        en = s1.nextInt();
        System.out.println("enter emp name ");
        ename = s1.next();
        System.out.println("enter emp deisgnation ");
        ed = s1.next();
        System.out.println("enter emp salary ");
        sa = s1.nextFloat();
        emp1.getdata(en, ename, ed, sa);
        emp1.showdata();


    }

}
