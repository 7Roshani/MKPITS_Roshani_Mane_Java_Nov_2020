package com.mkpits.java.overriding_and_overloading;

public class Employee {
    float salary;

    //method overloading
    void getdata(String name, float salary) {
        getdata(name);
        this.salary = salary;
    }

    //method overriding
    void showdata() {
        super.showdata();//call super class(person ) showdata method
        System.out.println("salary = " + salary);
    }

}
