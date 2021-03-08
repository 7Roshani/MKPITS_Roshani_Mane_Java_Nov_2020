package com.mkpits.java.default_method_interface;

public interface Drawable {
    void draw();

    default void msg(){System.out.println("default method");}

}