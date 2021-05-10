package com.mkpits.java.pattern;

public class Star18 {
    static void print_rectangle(int n, int m) {

        int i, j;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= m; j++) {

                if (i == 1 || i == n || j == 1 || j == m) //Logic to print

                    System.out.print("*"); //Tue?, print star

                else

                    System.out.print(" "); //Tue?, print space

            }

            System.out.println();

        }

    }

    public static void main(String args[]) {

        int rows = 10, columns = 10;

        print_rectangle(rows, columns); //Method call

    }
}
