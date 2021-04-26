package com.mkpits.java.this_con_par;

public class Student {
    int rollno;
    String name, course;
    float fee;

    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student(int rollno, String name, String course, float fee) {
        this.fee = fee;
        //this(rollno, name, course);//C.T.Error
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }

}
