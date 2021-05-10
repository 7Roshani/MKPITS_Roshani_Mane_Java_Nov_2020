package com.mkpits.java.pattern;

public class Star25 {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {

            int alphabet = 65; //ASCII value of “A”

            for (int j = 4; j > i; j--) {

                System.out.print(" "); //Print Space

            }

            for (int k = 0; k <= i; k++) {

                System.out.print((char) (alphabet + k) + " "); //Print Alphabet

            }

            System.out.println();

        }

    }
}
