package com.jee.revision.Section6.ControlFlow;

public class switchStatement {

    public static void main(String[] args) {

//        int value = 1;
////        int value = 2;
////        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually, it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        System.out.println("*****************");

        String month = "hi";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        System.out.println(exercise('a'));
    }

    public static String getQuarter(String month) {

        switch (month) {
//            case "JANUARY" :
//            case "FEBRUARY" :
//            case "MARCH" :
            case "JANUARY", "FEBRUARY", "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
            default: {
                String badresponse = month + " is bad";
                return badresponse;
            }
        }
    }

    public static String exercise(char input) {

        switch (input) {
            case 'a':
                System.out.println("Able");
                break;
            case 'b':
                System.out.println("Baker");
                break;
            case 'c':
                System.out.println("Charlie");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            case 'e':
                System.out.println("Easy");
                break;
            default:
                System.out.println("message not found");
                break;
        } return "";
    }
//    public static void printDayOfWeek(int day) {
//
//        String dayOfWeek = switch (day) {
//            case 0 : System.out.println("Sunday");
//            case 1 : System.out.println("Monday");
//            case 2 : System.out.println("Tuesday");
//            case 3 : System.out.println("Wednesday");
//            case 4 : System.out.println("Thursday");
//            case 5 : System.out.println("Friday");
//            case 6 : System.out.println("Saturday");
//            default : System.out.println("Invalid Day");
//        };
//        System.out.println(day + "stands for " + dayOfWeek);
}
