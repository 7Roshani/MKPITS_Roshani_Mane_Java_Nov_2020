package com.mkpits.java.synchronized_block;

public class TestSynchronizedBlock2 {
    public static void main(String args[]){
        final Table obj = new Table();//only one object

        Thread t1=new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }

}
