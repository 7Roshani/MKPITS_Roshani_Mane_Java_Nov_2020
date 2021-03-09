package com.mkpits.java.multilevel_inheritance;

public class Employee extends Person {
    float salary;

    void getemployeedata(float salary) {
        this.salary = salary;
    }

    void showemployeedata() {
        System.out.println("salary = " + salary);
    }
}
