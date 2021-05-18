package com.mkpits.java.pattern;

public class pattern38 {
    public static void main(String args[])
    {
        for(int i = 1; i <= 6; i++)
        {
            for(int j = 1; j <= 6-i; j++)
            {
                System.out.print(1);
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
