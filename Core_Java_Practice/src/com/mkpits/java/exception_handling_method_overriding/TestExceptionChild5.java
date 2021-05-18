package com.mkpits.java.exception_handling_method_overriding;

public class TestExceptionChild5 {
    void msg(){System.out.println("child");}

    public static void main(String args[]){
        Parent p= new Parent();
        try{
            p.msg();
        }catch(Exception e){}
    }

}
