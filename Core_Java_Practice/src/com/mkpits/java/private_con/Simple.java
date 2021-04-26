package com.mkpits.java.private_con;
// error:- A class cannot be private or protected except nested class.
class AA{
    public AA(){}//private constructor
    void msg(){System.out.println("Hello java");}
}
public class Simple{
    public static void main(String args[]){
        AA obj=new AA();//Compile Time Error
    }
}
