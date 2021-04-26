package com.mkpits.java.overriding_and_overloading;

public class parttimeemployee {
    int workinghours;

    //overloading
    void getdata(String name, float salary, int workinghours) {
        getdata(name, salary);
        this.workinghours = workinghours;
    }

    private void getdata(String name, float salary) {
    }

    //method overriding
    void showdata() {
        //super.showdata();
        System.out.println("working hours = " + workinghours);

    }


}
