package com.mkpits.java.multilevel_inheritance2;

public class parttimeemployee extends Employee {
    int workinghours;

    void getparttimeemployeedata(String name, float salary, int workinghours) {
        getemployeedata(name, salary);
        this.workinghours = workinghours;
    }

    void showparttimeemployeedata() {
        showemployeedata();
        System.out.println("working hours = " + workinghours);

    }


}
