package com.mkpits.java.exception_handling_method_overriding;

public class TestExceptionChild4 {
    void msg()throws ArithmeticException{System.out.println("child");}

    public static void main(String args[]){
        Parent2 p= new Parent2();
        try{
            p.msg();
        }catch(Exception e){}
    }

}
