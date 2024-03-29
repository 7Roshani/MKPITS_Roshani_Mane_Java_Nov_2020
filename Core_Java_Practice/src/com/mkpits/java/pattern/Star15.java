package com.mkpits.java.pattern;

import java.util.Scanner;

public class Star15 {
    public static void main(String[] args) {

        System.out.println("Number of rows: ");

        int rows = extracted().nextInt();

        int i;

//upper inverted V pattern

        for (i = 1; i <= rows; i++) {

            for (int j = rows; j > i; j--) {

                System.out.print(" "); //Print spaces

            }

            System.out.print("*"); //Print Spaces

            for (int k = 1; k < 2 * (i - 1); k++) {

                System.out.print(" "); //Print Spaces

            }

            if (i == 1) {

                System.out.println(""); //Condition true, go to newline

            } else {

                System.out.println("*"); //else print star

            }

        }

//Lower v pattern

        for (i = rows - 1; i >= 1; i--) {

            for (int j = rows; j > i; j--) {

                System.out.print(" "); //Print Spaces

            }

            System.out.print("*");

            for (int k = 1; k < 2 * (i - 1); k++) {

                System.out.print(" ");

            }

            if (i == 1)

                System.out.println(""); //newline

            else

                System.out.println("*"); //Print star

        }

    }

    private static Scanner extracted() {

        return new Scanner(System.in);

    }
}
