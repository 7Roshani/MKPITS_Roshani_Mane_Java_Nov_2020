package com.mkpits.java.private_con;
// error:- A class cannot be private or protected except nested class.
class A{
    private A(){}//private constructor
    void msg(){System.out.println("Hello java");}
}
public class Simple{
    public static void main(String args[]){
        A obj=new A();//Compile Time Error
    }
}
