package com.mkpits.java.multilevel_inheritance2;

public class Employee extends Person {
    float salary;

    void getemployeedata(String name, float salary) {
        getpersondata(name);
        this.salary = salary;
    }

    void showemployeedata() {
        showpersondata();
        System.out.println("salary = " + salary);
    }

}
