package com.jee.revision.Section5.Challenges;

import org.w3c.dom.ls.LSOutput;

public class SecondsAndMinutesChallenge {

    // transform seconds into hours
    // next, display time in hours, with the remaining minutes and seconds in a String.
    // both methods return a String as "XXh YYm ZZs"

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(minutesAndSeconds(59, 8));
    }

    public static String getDurationString(int seconds) {
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
    public static String minutesAndSeconds(int minutes, int seconds) {
        int hours = minutes / 60;
        System.out.println("hours = " + hours);
        int remainingMinutes = minutes % 60; // minutes
        System.out.println("minutes = " + remainingMinutes);
//        System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
        if (hours < 1) {    // if no hours, only print minutes and seconds
            return remainingMinutes + "m " + seconds + "s";
        } else {
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }
}
//        int hours = minutes / 60;
//        int minutes2 = seconds / 60;
//        if (minutes >= 60) {
//            return hours;
//        } else if (seconds >= 60) {
//            return minutes2;
//        } else {
//            return minutes + seconds;
//        }
//    }
//}
