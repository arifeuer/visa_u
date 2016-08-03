package com.visa_u.simpledatanalysis;
import com.sun.xml.internal.fastinfoset.sax.SystemIdResolver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    //Prompt user to enter number of data items they will provide
        System.out.print("Enter number of data items you wish to provide: ");
        String in = sc.nextLine();

        try {
            //Create array with indicated number of elements
            int num_elements = Integer.parseInt(in);
            if (num_elements < 1) {
                System.out.println("Error: please enter a positive value next time.");
                System.exit(1);
            }

            float[] data = new float[num_elements];
            int total = 0;
            float min_so_far = Float.MAX_VALUE;
            float max_so_far = Float.MIN_VALUE;

            for (int i = 0; i < num_elements; i++) {
                //Prompt user to enter each element, one by one, and store values in the array
                System.out.printf("Please enter element number %d: ", i + 1);
                String elem_str = sc.nextLine();
                float elem = Float.parseFloat(elem_str);
                data[i] = elem;

                //Keep track of mean/ min/ max data
                total += elem;
                if (elem > max_so_far) {
                    max_so_far = elem;
                }
                if (elem < min_so_far) {
                    min_so_far = elem;
                }

            }

            //Calculate the mean and print it out
            float mean = total / (float) num_elements;
            System.out.printf("The mean of the data set is %.2f", mean);

            //Print out the min/max
            System.out.printf(", the min is %f, and the max is %f", min_so_far, max_so_far);

            System.exit(0);

        } catch (NumberFormatException e) {
            System.out.println("Improperly formatted number, restart and try again");
            System.exit(1);
        }

    }
}
