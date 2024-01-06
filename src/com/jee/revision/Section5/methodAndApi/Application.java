package com.jee.revision.Section5.methodAndApi;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.checkMethod();
        System.out.println("sum of 10 and 20 : " + calculator.sumTwoNumbers(10,20));
        calculator.checkMaxNumber(10,20);
        System.out.println("sum of 1 to 10 : " + calculator.sum1to10());
        System.out.println("minus of 10 - 5 : " + calculator.minusTwoNumbers(10,5));


//        System.out.println("==== Method Overloading ====");
//        System.out.println(MethodOverloading.convertToCentimeters(5));
//        System.out.println("5ft, 8in = " + MethodOverloading.convertToCentimeters(5,8) + "cm");
//        System.out.println(MethodOverloading.convertToCentimeters(6,0));
    }

}
