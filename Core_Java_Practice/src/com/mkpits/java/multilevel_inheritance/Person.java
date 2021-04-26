package com.mkpits.java.multilevel_inheritance;

public class Person {
    String name;

    void getpersondata(String name) {
        this.name = name;
    }

    void showpersondata() {
        System.out.println("name = " + name);
    }

}
