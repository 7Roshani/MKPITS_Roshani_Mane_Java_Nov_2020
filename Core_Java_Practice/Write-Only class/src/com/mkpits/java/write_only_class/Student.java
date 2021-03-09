package com.mkpits.java.write_only_class;

// error:- Compile Time Error, because can't be accessed from outside the class
public class Student {
    //private data member
    private String college;

    //getter method for college
    public void setCollege(String college) {
        this.college = college;
    }

}
