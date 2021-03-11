package com.mkpits.java.file;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testou.txt");
            String s = "Welcome to mkpits.";
            byte b[] = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
