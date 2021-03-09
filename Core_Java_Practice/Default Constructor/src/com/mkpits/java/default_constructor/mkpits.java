package com.mkpits.java.default_constructor;

import java.util.Scanner;

public class mkpits {
    public static void main(String[] arg) {

        Scanner s1 = new Scanner(System.in);
        employee emp = new employee(); // it will call constructor automatically
		/*
		System.out.println("enter employee no");
		int en=s1.nextInt();
		System.out.println("enter emp name ");
		String ename=s1.next();
		System.out.println("enter emp deisgnation ");
		String ed=s1.next();
		System.out.println("enter emp salary ");
		float sa=s1.nextFloat();
		emp.getdata(en,ename,ed,sa);
		*/
        emp.showdata();


    }

}
