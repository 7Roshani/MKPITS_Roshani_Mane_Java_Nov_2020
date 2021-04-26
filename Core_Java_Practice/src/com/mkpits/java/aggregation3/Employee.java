package com.mkpits.java.aggregation3;

public class Employee {
    int empno;
    String empname;
    Address address;

    void getdata(int empno, String empname, Address address) {
        this.empno = empno;
        this.empname = empname;
        this.address = address;
    }

    void showdata() {
        System.out.println("empno " + empno);
        System.out.println("empname " + empname);
        System.out.println("city " + address.city);
        System.out.println("state " + address.state);
        System.out.println("pincode " + address.pincode);
    }


}
