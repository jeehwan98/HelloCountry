package com.jee.revision.Section5.CodingExercises;

public class No2SpeedConverter {


    public static long toMilesPerHour(double kilometersPerHour) {
        long value = 0;
        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
        }
        return (Math.round(kilometersPerHour / 1.609));
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour / 1.609) + " mi/h");
        }
    }
}
