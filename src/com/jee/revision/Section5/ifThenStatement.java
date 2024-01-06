package com.jee.revision.Section5;

public class ifThenStatement {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        calculateScore(true,800,5,100);
        calculateScore(true,10000,8,200);
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }
}
