package com.jee.revision.Section5;

public class ifElseStatement {

    public static void main(String[] args) {

        System.out.println("Hello, Tim");
        System.out.println("Hello World!");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("And I am scared of aliens");
        }


        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore | topScore <= 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen.");
        }

        double var1 = 20.00;
        double var2 = 80.00;
        double sumOfVar = var1 + var2;
        double multiplyOfVar = sumOfVar * 100.00;
        double remainder = multiplyOfVar % 40.00;
        boolean noRemainder = (remainder == 0) ? true : false;
//        if (remainder == 0.00) {
        System.out.println("No remainder : " + noRemainder);
//            System.out.println(true);
//        } else {
        if (!noRemainder) {
            System.out.println("Got some remainder");
        }
    }
}