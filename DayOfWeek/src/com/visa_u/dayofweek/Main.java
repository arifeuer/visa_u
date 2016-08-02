package com.visa_u.dayofweek;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            // Prompt user to enter a day, month, and year
            System.out.println("Please enter a date in the following format: dd/mm/yyyy");
            System.out.println("Enter \"quit\" in order to stop program");

            //Check if user quit

            //Read user input
            String in = sc.nextLine();

            //Parse input into integers (+ error checking)
            int[] date_ints = Main.parse_input(in);

            //Calculate the day of the week
            Date date;
            date = new Date(date_ints[0], date_ints[1], date_ints[2]);

            //Output the day of the week (number)
            System.out.printf("%s was a %s", in, date.dayOfWeekStr);
            System.out.println();

            //TODO: Translate day of week into its corresponding string
        }


    }

    public static int[] parse_input(String in) {
        String[] date_strings = in.split("/");
        int[] date_ints = new int[3];

        try {
            for (int i = 0; i < 3; i++) {
                date_ints[i] = Integer.parseInt(date_strings[i]);
            }
            //TODO: Check validity

            //return date_ints;
        } catch (Exception e) {
            System.out.println("Improperly formatted number, restart and try again!");
            System.exit(1);
        }
        return date_ints;
    }
}

class Date {
    int dayOfMonth;
    int month;
    int year;
    int dayOfWeek;
    String dayOfWeekStr;

    public Date(int dayOfMonth, int month, int year) {
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;
        this.dayOfWeek = calculate_day_of_week(dayOfMonth, month, year);
        this.dayOfWeekStr = day_of_week_to_str(this.dayOfWeek);
    }

    public int calculate_day_of_week(int dayOfMonth, int month, int year) {
        //Formula from https://en.wikipedia.org/wiki/Zeller%27s_congruence
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        int a, b, c, d, dayOfWeek;
        a = 13 * (month + 1) / 5;
        b = year / 4;
        c = 6 * (year / 100);
        d = year / 400;

        dayOfWeek = (a + b + c + d + year + dayOfMonth) % 7;
        return dayOfWeek;
    }

    public String day_of_week_to_str(int dayOfWeek) {
        switch (dayOfWeek) {
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            default:
                return "Friday";
        }
    }
}
