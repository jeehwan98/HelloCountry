package com.jee.revision.Section5.CodingExercises;

public class No4BarkingDog {

//    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
//
//        if (hourOfDay < 0 || hourOfDay > 23) {
//            isBarking = false;
//            return isBarking;
//        } else if (hourOfDay < 8 && hourOfDay >= 22) {
//            isBarking = true;
//        } else {
//            return isBarking;
//        }
//        return isBarking;
//    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            isBarking = false;
            return isBarking;
        } else {
            return isBarking && (hourOfDay < 8 || hourOfDay > 22);
        }
    }
}

