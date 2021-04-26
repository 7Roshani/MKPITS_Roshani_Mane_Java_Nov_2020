package com.mkpits.java.thiskey3;

public class Student {
    int rollno;
    String name;
    float fee;

    Student(int r, String n, float f) {
        rollno = r;
        name = n;
        fee = f;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }

}
