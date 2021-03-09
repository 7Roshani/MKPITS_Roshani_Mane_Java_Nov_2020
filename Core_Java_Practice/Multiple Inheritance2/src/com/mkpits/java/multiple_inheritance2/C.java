package com.mkpits.java.multiple_inheritance2;

// out will be Compile Time Error
public class C extends A,B{//suppose if it were

    public static void main(String args[]){
        C obj=new C();
        obj.msg();//Now which msg() method would be invoked?
    }
}
