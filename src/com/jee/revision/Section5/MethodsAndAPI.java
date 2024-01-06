package com.jee.revision.Section5;

public class MethodsAndAPI {

    public static void main(String[] args) {


        MethodsAndAPI app1 = new MethodsAndAPI();
        int first = 20;
        int second = 40;

        System.out.println("두 수를 더한 결과 : " + (first + second));
        System.out.println("두 수를 더한 결과 : " + app1.plusTwoNumbers(first, second));
    }

    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }
}

