package com.mkpits.java.enhanced_for_loop;

public class EnhancedForDemo {
    public static void main(String[] args) {
        int[] numbers =
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }

}