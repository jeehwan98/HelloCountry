package com.jee.revision.Section5.Challenges;

public class BonusChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
//        System.out.println(minutesAndSeconds(-65, 8));
//        System.out.println(minutesAndSeconds(65, 145));
    }

    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            System.out.println("invalid number");
        } else {
            int hours = seconds / 3600;
            System.out.println("hours = " + hours);
            int remainingMinutes = seconds % 3600;
            int remainingMinutesIntoMinutes = remainingMinutes / 60;
            System.out.println("minutes = " + remainingMinutesIntoMinutes);
            int remainingSeconds = remainingMinutes % 60;
            System.out.println("seconds = " + remainingSeconds);
//        System.out.println(hours + "h " + remainingMinutesIntoMinutes + "m " + remainingSeconds + "s");
//        return seconds;
            return hours + "h " + remainingMinutesIntoMinutes + "m " + remainingSeconds + "s";
        }
        return "";
    }
}

//    public static String minutesAndSeconds(int minutes, int seconds) {
//        if (minutes > 0) {
//            if (seconds >= 0 && seconds <= 59) {
//                int hours = minutes / 60;
//                System.out.println("hours = " + hours);
//                int remainingMinutes = minutes % 60; // minutes
//                System.out.println("minutes = " + remainingMinutes);
//                System.out.println("seconds = " + seconds);
////        System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
//                if (hours < 1) {    // if no hours, only print minutes and seconds
//                    return remainingMinutes + "m " + seconds + "s";
//                } else if (){
//                    return hours + "h " + remainingMinutes + "m " + seconds + "s";
//                    if (seconds > 59) {
//                        int minutes1 = seconds / 60;   // seconds is negative or more than 60.
//                        int seconds1 = seconds % 60;
//                        return hours + "h " + minutes1 + "m " + seconds1 + "s";
//                    }
//                }
//            } else {
//                System.out.println("invalid number");
//            }
//        }
//            return "";
//    }
//}