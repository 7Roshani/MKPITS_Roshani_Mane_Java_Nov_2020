package com.mkpits.java.exception_handling_method_overriding;

public class TestExceptionChild3 {
    void msg()throws Exception{System.out.println("child");}

    public static void main(String args[]){
        Parent p= new Parent();
        try{
            p.msg();
        }catch(Exception e){}
    }

}
