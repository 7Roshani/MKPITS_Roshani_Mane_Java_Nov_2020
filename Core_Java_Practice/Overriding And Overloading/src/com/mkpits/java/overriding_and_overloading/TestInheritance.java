package com.mkpits.java.overriding_and_overloading;

import java.util.Scanner;

public class TestInheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        parttimeemployee emp = new parttimeemployee();
        System.out.println("enter employee name");
        String ename = sc.next();
        System.out.println("enter salary");
        float sal = sc.nextFloat();
        System.out.println("enter employee working hours");
        int whours = sc.nextInt();

        emp.getdata(ename, sal, whours);

        emp.showdata();

    }

}
