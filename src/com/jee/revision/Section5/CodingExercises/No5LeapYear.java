package com.jee.revision.Section5.CodingExercises;

public class No5LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
        } if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}