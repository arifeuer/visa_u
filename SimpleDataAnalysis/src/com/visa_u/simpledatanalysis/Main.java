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
            int[] data = new int[num_elements];

            for (int i = 0; i < num_elements; i++) {
                //Prompt user to enter each element, one by one, and store values in the array
                System.out.printf("Please enter element number %d", i + 1);
                String elem_str = sc.nextLine();
                int elem = Integer.parseInt(elem_str);
                data[i] = elem;
            }

            //Calculate the mean and print it out

            //Print out the min/max

        } catch (NumberFormatException e) {
            System.out.println("Improperly formatted number, restart and try again");
            System.exit(1);
        }

    }
}
