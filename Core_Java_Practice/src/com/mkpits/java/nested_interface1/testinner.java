package com.mkpits.java.nested_interface1;

public class testinner implements student.instudent, student.instudent1 {

    public void msg() {
        System.out.println("hello from msg");
    }

    public void msg1() {
        System.out.println("hello from msg1");
    }

    public static void main(String[] arg) {
        student.instudent ss = new testinner();
        ss.msg();
        student.instudent1 ss1 = new testinner();
        ss1.msg1();

    }

}
