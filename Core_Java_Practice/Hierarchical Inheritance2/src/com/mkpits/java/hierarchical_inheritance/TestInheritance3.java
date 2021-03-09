package com.mkpits.java.hierarchical_inheritance;

public class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        //c.bark();//C.T.Error
        Dog d = new Dog();
        d.bark();
        d.eat();
    }

}
