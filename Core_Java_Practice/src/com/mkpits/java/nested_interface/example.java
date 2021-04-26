package com.mkpit.java.nested_interface;

public class example implements printable.MessagePrintable {
    public void print() {
        System.out.println("print");
    }

    public void msg() {
        System.out.println("msg");
    }
}
