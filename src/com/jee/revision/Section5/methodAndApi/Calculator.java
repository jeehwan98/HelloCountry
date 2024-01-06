package com.jee.revision.Section5.methodAndApi;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        int max = a;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("max number is " + max);
    }

    public int sumTwoNumbers(int a, int b) {
        return (a + b);
    }

    public int minusTwoNumbers(int a, int b) {
        if (a > b) {
            return (a - b);
        } else {
            return (b - a);
        }
    }

}
