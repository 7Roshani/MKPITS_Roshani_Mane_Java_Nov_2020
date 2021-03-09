package com.mkpits.java.overriding_and_overloading;

public class Person {
    String name;

    void getdata(String name) {
        this.name = name;
    }

    void showdata() {
        System.out.println("name = " + name);
    }

}
