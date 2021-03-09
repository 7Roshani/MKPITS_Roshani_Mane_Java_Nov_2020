package com.mkpits.java.single_interface3;

class TestInterface1 {
    public static void main(String args[]) {
        Drawable d = new Circle();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
    }
}
