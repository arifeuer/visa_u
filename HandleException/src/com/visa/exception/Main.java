package com.visa.exception;
import com.sun.media.sound.InvalidFormatException;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args)  {
	    //Prompt user to enter two filenames
        boolean validFileNames = false;
        Scanner sc = new Scanner(System.in);
        String [] fileNames = null;

        while (fileNames == null) {
            try {
                fileNames = Main.initialPrompt(sc);
            } catch (InvalidFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        File sourceFile = new File(fileNames[0]);
        File destFile = new File(fileNames[1]);

        //If first file doesn't exist, print message
        //Ask for first file again
        while (!sourceFile.exists()) {
            System.out.print("Could not find source file, please input just source file again: ");
            sourceFile = new File(sc.nextLine());
        }

        //If first file does exist, copy contents into second file
        //If any IO exceptions are thrown, report problem and re-prompt for second file
        boolean successfulTransfer = false;

        while (!successfulTransfer) {
            try {
                successfulTransfer = transferFile(sourceFile, destFile);
            } catch (IOException e) {
                System.out.println(e.getCause());
                System.out.print("Please input target file again: ");
                destFile = new File(sc.nextLine());
            }
        }

        System.exit(0);
    }

    public static boolean transferFile(File sourceFile, File destFile) throws IOException {
        //Trying out java.nio.channels method from http://stackoverflow.com/questions/106770/standard-concise-way-to-copy-a-file-in-java/115086#115086
        FileChannel source = null;
        FileChannel dest = null;

        try {
            source = new FileInputStream(sourceFile).getChannel();
            dest = new FileOutputStream(destFile).getChannel();
            dest.transferFrom(source, 0, source.size());
        } finally {
            if (source != null) {
                source.close();
            }
            if (dest != null) {
                dest.close();
            }
        }
        return true;
    }

    public static String[] initialPrompt(Scanner sc) throws InvalidFormatException {
        System.out.print("Please enter two filenames, separated by a space: ");

        //Parse out filenames
        String[] fileNames = sc.nextLine().trim().split(" ");

        if (fileNames.length != 2) {
            throw new InvalidFormatException("Invalid formatting, please try again");
        }

        return fileNames;
    }

    /*public static File loadSourceFile(Scanner sc, String fileName) throws IOException {
        File source = new File(fileName);

    }*/
}
