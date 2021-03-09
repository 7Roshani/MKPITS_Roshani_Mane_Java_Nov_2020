package com.mkpits.java.final_variable;

// out put will be error
class Bike9 {
    final speedlimit=90;//final variable

    void run() {
        speedlimit = 400;
    }

    public static void main(String args[]) {
        Bike9 obj = new Bike9();
        obj.run();
    }
}

