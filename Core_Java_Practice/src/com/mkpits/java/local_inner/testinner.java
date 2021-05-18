package com.mkpits.java.local_inner;

public class testinner {
    public static void main(String[] arg) {
        student s = new student();
        student.address sa = s.new address();
        sa.showdata();
    }

}
