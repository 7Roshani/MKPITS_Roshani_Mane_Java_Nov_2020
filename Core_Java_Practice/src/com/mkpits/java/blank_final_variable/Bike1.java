package com.mkpits.java.blank_final_variable;

class Bike1 {
    int speedlimit;//blank final variable

    Bike1(int speedlimit) {
        this.speedlimit = speedlimit;
    }

    void Bike10() {
        speedlimit = 70;
        System.out.println(speedlimit);
    }

    public static void main(String args[]) {
        new Bike10();
    }

}
