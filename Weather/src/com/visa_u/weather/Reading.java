package com.visa_u.weather;

public class Reading {
    String dayOfWeek;
    int hourOfDay, temp, windSpeed;

    public Reader(String weatherInfo) {
        try {
            String[] elements = weatherInfo.split(", ");
            dayOfWeek = elements[0];
            hourOfDay = Integer.parseInt(elements[1]);
            temp = Integer.parseInt(elements[2]);
            windSpeed = Integer.parseInt(elements[3]);

        } catch (NumberFormatException e) {
            System.out.println("Malformed text given to Reader.");
            e.printStackTrace();
            System.exit(1);
        }

    }

    public String rateTempurate() {
        // Implement
        return "";
    }

    public String getTime() {
        // Implement
        return "";
    }
}
