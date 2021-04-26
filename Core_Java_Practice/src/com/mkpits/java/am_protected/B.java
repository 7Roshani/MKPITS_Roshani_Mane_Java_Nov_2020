package com.mkpits.java.am_protected;

class A{
    protected void msg(){System.out.println("Hello");}
}

//save by BB.java

class B extends A{
    public static void main(String args[]){
        B obj = new B();
        obj.msg();
    }
}
