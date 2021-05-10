package com.mkpits.java.pattern;

import java.util.Scanner;

public class Star23 {
    public static void main(String[] args) {

        char[] alpha = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',

                'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        int digit = 0;

        String[] ruby = new String[26];

        System.out.print("Input Uppercase alphabet between A to Z:");

        Scanner reader = new Scanner(System.in);

        try {

            char aplhabet = reader.next("[A-Z]").charAt(0);

            for (int i = 0; i < alpha.length; i++) {

                if (alpha[i] == aplhabet) {

                    digit = i;

                    break;

                }

            }

            for (int i = 0; i <= digit; i++) {

                ruby[i] = "";

                for (int p = 0; p < digit - i; p++) {

                    ruby[i] += " ";

                }

                ruby[i] += alpha[i];

                if (alpha[i] != 'A') {

                    for (int p = 0; p < 2 * i - 1; p++) {

                        ruby[i] += " ";

                    }

                    ruby[i] += alpha[i];

                }

                System.out.println(ruby[i]);

            }

            for (int i = digit - 1; i >= 0; i--) {

                System.out.println(ruby[i]);

            }

        } catch (Exception e) { //Exception

            e.printStackTrace();

        } finally {

            reader.close();

        }

    }
}
