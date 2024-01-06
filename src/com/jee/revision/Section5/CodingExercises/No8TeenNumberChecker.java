package com.jee.revision.Section5.CodingExercises;

public class No8TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen (int num4) {
        if (num4 >= 13 && num4 <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
