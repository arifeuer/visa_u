package com.visa.exception;

public class Main {

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

    }

    public static boolean validateDate(String monthStr, int dayStr) {
        try {
            boolean validMonth = validateMonth(monthStr);
            boolean validDay = validateDay(dayStr);
        } catch (BadMonthException e) {

        } catch (BadDayException e) {

        }


    }

    public static boolean validateMonth(String monthStr) throws BadMonthException {

        try {
            Month month = Month.valueOf(monthStr);
        } catch (Exception e) {
            throw new BadMonthException(e.getCause());
        }
    }

    public static boolean validateDay(int dayStr) throws BadDayException {

    }
}


