package com.mkpits.java.pattern;

public class pattern37 {
    public static void main(String args[])
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 6-i; j >= 1; j--)
            {
                System.out.print(j);
            }
            if(i>1)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 6-i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
