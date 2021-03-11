package com.mkpits.java.file;

import java.io.FileOutputStream;

public class WriteAInFile {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            for(int N=65;N<=90;N++) {
                fout.write(N);
                System.out.println("\t");
            }
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
