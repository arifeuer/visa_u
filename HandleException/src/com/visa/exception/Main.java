package com.visa.exception;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Prompt user to enter two filenames
        boolean validFileNames = false;
        Scanner sc = new Scanner(System.in);
        String [] fileNames = new String[2];

        while (!validFileNames) {
            validFileNames = Main.prompt(sc, fileNames);
        }

        //Copy the first (presumed to exist) into the second (probably doesn't exist)

            //If first file doesn't exist, print message
                //Ask for first file again

            //If first file does exist, copy contents into second file
                //If any IO exceptions are thrown, report problem and re-prompt for second file

        //Exit after one successful copy
    }

    public static boolean prompt(Scanner sc, String[] fileNames) {
        System.out.print("Please enter two filenames, separated by a space: ");

        //Parse out filenames
        fileNames = sc.nextLine().split(" ");

        if (fileNames.length == 2) {
            return true;
        } else {
            System.out.printf("%n Invalid formatting, please try again%n");
            return false;
        }
    }
}
