package com.mkpits.java.multilevel_inheritance;

public class parttimeemployee extends Employee {
    int workinghours;

    void getparttimeemployeedata(int workinghours) {
        this.workinghours = workinghours;
    }

    void showparttimeemployeedata() {
        System.out.println("working hours = " + workinghours);
    }

}

