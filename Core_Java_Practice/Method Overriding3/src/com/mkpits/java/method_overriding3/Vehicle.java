package com.mkpits.java.method_overriding3;

public class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("bike is running");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("car is running");
    }
}

//Creating a child class
class honda {
    public static void main(String args[]) {
        //creating an instance of child class
        Bike obj = new Bike();
        //calling the method with child class instance
        obj.run();
        Car obj1 = new Car();
        //calling the method with child class instance
        obj1.run();
    }

}
