package com.mkpits.java.pattern;

import java.util.Scanner;

public class Star19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Input

        System.out.println("Number of rows: ");

        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " "); //Print j value and space

            }

            System.out.println();

        }

        sc.close();

    }
}
