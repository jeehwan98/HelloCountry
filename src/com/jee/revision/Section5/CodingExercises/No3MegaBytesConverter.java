package com.jee.revision.Section5.CodingExercises;

public class No3MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int value1 = 0;
        int value2 = 0;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes > 0) {
            value1 = Math.round(kiloBytes % 1024);
            value2 = (int) (Math.ceil(kiloBytes / 1024));
            System.out.println(kiloBytes + " KB = " + value2 + " MB and " + value1 + " KB");
        } else {
            System.out.println(kiloBytes + " KB = " + value2 + " MB and " + value1 + " KB"); // 0일 때
        }
    }
}
