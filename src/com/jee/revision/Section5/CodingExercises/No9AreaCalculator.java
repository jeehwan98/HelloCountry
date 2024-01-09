package com.jee.revision.Section5.CodingExercises;
import java.lang.Math;
public class No9AreaCalculator {

    public static void main(String[] args) {
        System.out.println("area of a circle = " + area(5));
        System.out.println("area of a rectangle = " + area(-1.0,4.0));

    }

    public static double area (double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            double value = Math.PI * Math.pow(radius,2);
        }
        return Math.PI * Math.pow(radius,2);
    }
    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            double areaOfRectangle = x * y;
        } return x*y;
    }
}
