package com.visa_u.tempconvert;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompt the user to enter a Fahrenheit temperature
        System.out.println("Please enter a Fahrenheit temperature value to be converted to Celsius:");

        //Read the temperature from the console input
        String in = sc.nextLine();

        try {
            //Convert the text that was entered into a double value stored in a variable
            double temp_f = Double.valueOf(in);

            //Perform the conversion and store the resulting Celsius temperature in a variable.
            double temp_c = Main.fToC(temp_f);

            //Print out a message stating what he Celsius temperature is.
            System.out.printf("%s degrees F is equivalent to %.2f" + " degrees C", in, temp_c);
            System.exit(0);

        } catch (NumberFormatException e) {
            System.out.println("Improperly formatted number, restart and try again!");
            System.exit(1);
        }
    }

    public static double fToC(double temp_f) {
        double temp_c = (double) 5 * (temp_f - (double) 32) / (double) 9;
        return temp_c;
    }
}