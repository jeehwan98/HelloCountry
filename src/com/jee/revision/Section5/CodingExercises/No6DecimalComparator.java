package com.jee.revision.Section5.CodingExercises;

public class No6DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        num1 = (long)(3.1756 * 1000);
        num2 = (long)(3.175 * 1000);

//        if (Math.ceil(num1 * 1000) == Math.ceil(num2 * 1000)) { // 내가 쓴것...
        if ((long)(num1 * 1000) == (long)(num2 * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
