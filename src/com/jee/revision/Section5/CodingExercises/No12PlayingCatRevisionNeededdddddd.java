package com.jee.revision.Section5.CodingExercises;

public class No12PlayingCatRevisionNeededdddddd {

    public static void main(String[] args) {
        isCatPlaying(true,10);
    }

        public static boolean isCatPlaying(boolean summer, int temperature) {

            int max = summer ? 45 : 35;
            return temperature >= 25 && temperature <= max;
        }
    }

