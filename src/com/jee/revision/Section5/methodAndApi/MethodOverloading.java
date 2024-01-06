package com.jee.revision.Section5.methodAndApi;

import javax.swing.*;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("5ft, 8inch = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68inch = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters (int inches) {
//        double value = inches * 2.54;
//        return value;
        return inches * 2.54;
    }

    public static double convertToCentimeters (int feet, int inches) {
//        double inch = 2.54;
//        double foot = 12 * inch;
//        double value = feet * foot + inches * inch;
        return (feet * 12 + inches) * 2.54;
    }
}
