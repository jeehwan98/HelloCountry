package com.jee.revision.Section5.Challenges;

public class MethodChallenge {
    public static void main(String[] args) {
        HighScorePosition("Tim", calculateHighScorePosition(1500)); //

    }
    public static void HighScorePosition (String name,int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        int result = 0;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500 /*&& score < 1000*/) {
            result = 2;
        } else if (score >= 100 /*&& score < 500*/) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }
}
