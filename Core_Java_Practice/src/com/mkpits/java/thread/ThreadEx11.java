package com.mkpits.java.thread;

public class ThreadEx11 implements Runnable {
    public void run() {
        for(int i=1;i<25;i++) {
            System.out.println("my thread is running " + i);
        }
    }

    public static void main(String[] arg) {
        ThreadEx11 th=new ThreadEx11();
        Thread t=new Thread(th);
        t.start();
        Thread t1=new Thread(th);
        t1.start();
    }

}
