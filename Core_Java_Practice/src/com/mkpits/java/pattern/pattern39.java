package com.mkpits.java.pattern;

public class pattern39 {
    static void print_rectangle(int n, int m)

    {

        int i, j;

        for (i = 1; i <= n; i++)

        {

            for (j = 1; j <= m; j++)

            {

                if (i == 1 || i == n || j == 1 || j == m)

                 System.out.println("*");

                else

                System.out.println(" ");


            }

            System.out.println();

        }

    }

    //Driver program

    public static void main(String args[])

    {

        int rows = 6, columns = 20;

        print_rectangle(rows, columns);

    }
}
