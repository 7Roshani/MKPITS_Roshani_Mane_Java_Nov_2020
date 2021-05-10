package com.mkpits.java.pattern;

import java.util.Scanner;

public class Star10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt(); //Input

//Upper Inverted Pyramid

        for (int i = 0; i <= rows - 1; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(" ");
            }

            for (int k = i; k <= rows - 1; k++) {

                System.out.print("*" + " "); //Print star and blank space

            }

            System.out.println(""); //New line

        }

//For lower Pyramid

        for (int i = rows - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print(" "); //Print spaces

            }

            for (int k = i; k <= rows - 1; k++) {

                System.out.print("*" + " "); //Print Star and Space

            }

            System.out.println(""); //Print New line

        }

        sc.close();

    }
}
