package com.mkpits.java.pattern;

public class Star24 {
    public static void main(String[] args) {

        int alphabet = 65; //ASCII value of “A”

        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print((char) (alphabet + j) + " "); //Logic to print Alphabet pattern

            }

            System.out.println();

        }

    }
}
