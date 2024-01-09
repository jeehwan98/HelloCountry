package com.jee.revision.Section5.CodingExercises;

public class No10MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);

    }

    public static void printYearsAndDays (long minutes) {
        int year = 365 * 24 * 60; // years into minutes
        int day = 24 * 60; // days into minutes
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes % year == 0) {    // 집가서 이어서 하기..!
            int minutesToYears = (int) (minutes / year);
            System.out.println(minutes + " min = " + minutesToYears + " y and " + "0 d");
        } else if (minutes % day == 0) {
            int minutesToYears = (int) (minutes / year);    // years
            int remainingMinutes = (int)(minutes % year);   // only minutes
            int remainingDays = (int)(remainingMinutes / day);  // convert minutes into days
//            int minutesToDays = (int)(minutes / day);

            System.out.println(minutes + " min = " + minutesToYears + " y and " + remainingDays + " d");
        }
    }
}
