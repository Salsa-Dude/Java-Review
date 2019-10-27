package com.Joseph;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHour) {

        double kiloToMiles = 0.621371;

        if (kilometerPerHour < 0) {
            return  -1;
        }

        long milesPerHour = Math.round(kilometerPerHour * kiloToMiles);

        return milesPerHour;

    }

    public static void printConversion(double kilometerPerHour) {
        long milesPerHour = toMilesPerHour(kilometerPerHour);

        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometerPerHour + "km in miles is " + milesPerHour);
        }
    }
}
