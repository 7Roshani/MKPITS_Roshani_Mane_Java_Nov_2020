package com.mkpits.java.simultanious_writing_reading;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileOutputStreamex {
    public static void main(String[] arg) {
        try {

            //Data to write in File using PrintWriter
            PrintWriter writer1 = null;
            writer1 = new PrintWriter(new File("e:\\testout.txt"));
            writer1.write("oracle microsoft java vc.");
            writer1.flush();
            writer1.close();

            // to read data

            FileReader fr = new FileReader("e:\\testout.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();


        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

}
