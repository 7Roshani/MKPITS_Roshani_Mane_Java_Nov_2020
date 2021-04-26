package com.mkpits.java.md_default;

class A{
    void msg(){System.out.println("Hello");}
}

//save by BB.java

class B{
    public static void main(String args[]){
        A obj = new A();//Compile Time Error
        obj.msg();//Compile Time Error
    }
}

