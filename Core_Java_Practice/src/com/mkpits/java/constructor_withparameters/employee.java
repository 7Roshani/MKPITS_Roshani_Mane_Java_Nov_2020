package com.mkpits.java.constructor_withparameters;

public class employee {
    int empno;
    String empname;
    String designation;
    float salary;

    //creating a constructor with no parameters
    public employee() {
        empno = 007;
        empname = "bond";
        designation = "detective";
        salary = 4444.4f;
    }

    //creating a parameterized constructor
    public employee(int en, String ena, String des, float sal) {
        empno = en;
        empname = ena;
        designation = des;
        salary = sal;
    }

    void showdata() {
        System.out.println("------------------------------------- ");
        System.out.println("-----------Employee Details--------- ");
        System.out.println("empno = " + empno);
        System.out.println("empname = " + empname);
        System.out.println("designation = " + designation);
        System.out.println("salary = " + salary);
        System.out.println("------------------------------------- ");
    }

}
