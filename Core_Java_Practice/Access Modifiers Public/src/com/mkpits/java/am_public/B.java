package com.mkpits.java.am_public;

class A{
    public void msg(){System.out.println("Hello");}
}

//save by B.java


class B{
    public static void main(String args[]){
        A obj = new A();
        obj.msg();
    }

}
