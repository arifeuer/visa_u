package com.visa_u.weather;
import java.io.BufferedReader;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws Throwable {
        BufferedReader br = Files.newBufferedReader(
                Paths.get("weather.csvx"));
        Reading[] readings = new Reading[12];

        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());

            //Printout descriptions, e.g. "Monday afternoon was hot"
            System.out.printf("%s %s was %s%n", readings[i].dayOfWeek, readings[i].getTime(), readings[i].rateTempurate());
        }

    }
}

