package com.mkpits.java.this_key;

public class B {
    A4 obj;

    B(A4 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);//using data member of A4 class
    }

}
