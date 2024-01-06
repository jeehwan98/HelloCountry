package udemy.java17MasterClass.section3;

public class FirstSteps {


    public static void main(String[] args) {

    int myValue = 1000;
    int myMaxIntValue = Integer.MIN_VALUE;

        System.out.println(myMaxIntValue);

        short firstShort = 1; long secondLong = 2;
        System.out.println(firstShort);
        System.out.println(secondLong);

        byte num1 = 10;
        short num2 = 20;
        int num3 = 50;
        long num4 = 50_000;
        System.out.println(num4 + (long) (10*(num1 + num2 + num3)));


        int myDoubleInt = 5/2;
        System.out.println(myDoubleInt);
//        double myDoubleInt2 = (double)5/2; // or 5f/2f gives the same result too or 5d/2d as well
//        System.out.println(myDoubleInt2);

        System.out.println("========================================== 예시 ==========================================");

        int number1;
        number1 = 200;
        double pound = 0.45359238;
        double convertToKg = number1 * pound;
        System.out.println("number1 to kilograms : " + Math.round(convertToKg) + "kg");

        String myString = "I wish I had \u00241,000,000.00";    // unicode added in the String produces an output of the char
        System.out.println(myString);

        {
            String numberString = "250.55";
            numberString = numberString + "49.45";
            System.out.println(numberString);
        }

        {
            int result = 10;
            result--;       // compound assignment operator
            System.out.println(result);
        }
    }



}
