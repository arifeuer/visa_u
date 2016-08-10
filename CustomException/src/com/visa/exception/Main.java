package com.visa.exception;

import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                String [] dateStrs = Main.promptUser(sc);
                boolean validDate = Main.validateDate(dateStrs[0], Integer.valueOf(dateStrs[1]));

                if (validDate) {
                    System.out.println("Valid date!");
                } else {
                    System.out.println("Invalid date.");
                }
            } catch (Exception e) {
                System.out.println(e.getCause() + " " + e.getMessage());
            }

        }
    }

    public static String[] promptUser(Scanner sc) {
        String[] dateStrs = null;

        System.out.print("Please input a date and I'll validate it. Write the month and day, separated by a space: ");
        String input = sc.nextLine();


        if (input.trim().toLowerCase().equals("quit")) {
            System.exit(0);
        }

        dateStrs = input.trim().split(" ");
        if (dateStrs.length != 2) {
            throw new IllegalArgumentException("Improperly formatted date.");
        }

        return dateStrs;
    }

    public static boolean validateDate(String monthStr, int dayStr) {
        boolean validDay = false;
        try {
            Month validMonth = validateMonth(monthStr);
            validDay = validateDay(dayStr, validMonth);
        } catch (BadMonthException e) {
            System.out.println(e.getMessage() + " " + e.getCause());
        } catch (BadDayException e) {
            System.out.println(e.getMessage() + " " + e.getCause());
        }

        return validDay;
    }

    public static Month validateMonth(String monthStr) throws BadMonthException {
        Month month;
        try {
            month = Month.valueOf(monthStr.toUpperCase());
        } catch (Exception e) {
            throw new BadMonthException("Could not resolve month", e.getCause());
        }

        return month;
    }

    public static boolean validateDay(int dayStr, Month month) throws BadDayException {
        boolean dayMatchesMonth;
        try {
            int monthIndex = Arrays.asList(Month.values()).indexOf(month);
            dayMatchesMonth = (Integer.valueOf(dayStr) <= daysInMonth[monthIndex]) && (Integer.valueOf(dayStr) > 0);
        } catch (Exception e) {
            throw new BadDayException("Could not resolve day", e.getCause());
        }

        return dayMatchesMonth;
    }

}


