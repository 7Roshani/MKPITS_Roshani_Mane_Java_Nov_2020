package com.mkpits.java.this_keyword;

class R {

    int x;

    R() {
        x = 20;
        System.out.println("hello x = " + x); //20
    }

    R(int x) {
        this();
        System.out.println(this.x); //20
    }
}

class TestThis2 {
    public static void main(String args[]) {
        A a = new A(10);
    }
}
