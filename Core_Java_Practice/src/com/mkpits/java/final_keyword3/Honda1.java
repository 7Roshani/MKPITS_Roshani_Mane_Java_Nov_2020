package com.mkpits.java.final_keyword3;
//Out put will be Compile Time Error
public class Honda1 extends Bike {
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Honda1 honda = new Honda1();
        honda.run();
    }
}
