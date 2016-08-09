package com.visa.exception;
import com.sun.media.sound.InvalidFormatException;

import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args)  {
	    //Prompt user to enter two filenames
        boolean validFileNames = false;
        Scanner sc = new Scanner(System.in);
        String [] fileNames = new String[2];

        while (!validFileNames) {
            try {
                validFileNames = Main.initialPrompt(sc, fileNames);
            } catch (InvalidFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        //File source = new File(fileNames[0]);
        //File dest = new File(fileNames[1]);

        //Copy the first (presumed to exist) into the second (probably doesn't exist)

            //If first file doesn't exist, print message
                //Ask for first file again



            //If first file does exist, copy contents into second file
                //If any IO exceptions are thrown, report problem and re-prompt for second file

        //Exit after one successful copy
    }

    public static boolean initialPrompt(Scanner sc, String[] fileNames) throws InvalidFormatException {
        System.out.print("Please enter two filenames, separated by a space: ");

        //Parse out filenames
        fileNames = sc.nextLine().trim().split(" ");

        if (fileNames.length != 2) {
            throw new InvalidFormatException("Invalid formatting, please try again");
        }

        return true;
    }
}
