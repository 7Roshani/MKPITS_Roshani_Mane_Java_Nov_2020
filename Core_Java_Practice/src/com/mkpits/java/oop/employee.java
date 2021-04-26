package com.mkpits.java.oop;

class employee {
    int empno;
    String empname;
    String designation;
    float salary;

    void getdata(int a, String b, String c, float d) {
        empno = a;
        empname = b;
        designation = c;
        salary = d;
    }

    void showdata() {
        System.out.println("empno = " + empno);
        System.out.println("empname = " + empname);
        System.out.println("designation = " + designation);
        System.out.println("salary = " + salary);
    }

}
