package com.mkpits.java.pattern;

public class Star14 {
    static void pattern(int n) {

        int i, j;

        for (i = n - 1; i >= 0; i--) {

            for (j = n - 1; j > i; j--) {

                System.out.print(" "); //Print Space

            }

            System.out.print("*"); //Print star

            for (j = 1; j < (i * 2); j++)

                System.out.print(" ");//Print space

            if (i >= 1)

                System.out.print("*");

            System.out.print("\n");//Enter newline

        }

    }

    public static void main(String args[]) {

        int n = 5;

        pattern(n); //Pattern method call

    }
}
