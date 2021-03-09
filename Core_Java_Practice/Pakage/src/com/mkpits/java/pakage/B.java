package com.mkpits.java.pakage;

class A {
    public void msg() {
        System.out.println("Hello");
    }
}

//save by B.java
  
class B {
    public static void main(String args[]) {
        pack.A obj = new pack.A();//using fully qualified name
        obj.msg();
    }
}
