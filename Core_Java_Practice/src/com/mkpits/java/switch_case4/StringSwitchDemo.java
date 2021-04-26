package com.mkpits.java.switch_case4;

import java.lang.String;
public class StringSwitchDemo {
    public static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        if ("january".equals(month.toLowerCase())) {
            monthNumber = 1;
        } else if ("february".equals(month.toLowerCase())) {
            monthNumber = 2;
        } else if ("march".equals(month.toLowerCase())) {
            monthNumber = 3;
        } else if ("april".equals(month.toLowerCase())) {
            monthNumber = 4;
        } else if ("may".equals(month.toLowerCase())) {
            monthNumber = 5;
        } else if ("june".equals(month.toLowerCase())) {
            monthNumber = 6;
        } else if ("july".equals(month.toLowerCase())) {
            monthNumber = 7;
        } else if ("august".equals(month.toLowerCase())) {
            monthNumber = 8;
        } else if ("september".equals(month.toLowerCase())) {
            monthNumber = 9;
        } else if ("october".equals(month.toLowerCase())) {
            monthNumber = 10;
        } else if ("november".equals(month.toLowerCase())) {
            monthNumber = 11;
        } else if ("december".equals(month.toLowerCase())) {
            monthNumber = 12;
        } else {
            monthNumber = 0;
        }

        return monthNumber;
    }

    public static void main(String[] args) {

        String month = "August";

        int returnedMonthNumber =
                StringSwitchDemo.getMonthNumber(month);

        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }

}
