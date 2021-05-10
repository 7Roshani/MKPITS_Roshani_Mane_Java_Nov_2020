package com.mkpits.java.pattern;

public class Star21 {
    public static void main(String[] args) {

        int x = 6;

        for (int i = 0; i < x; i++) {

            int num = 1;

            System.out.printf("%" + (x - i) * 2 + "s", ""); //Pascals triangle logic

            for (int j = 0; j <= i; j++) {

                System.out.printf("%4d", num);

                num = num * (i - j) / (j + 1);

            }

            System.out.println();

        }

    }
}
