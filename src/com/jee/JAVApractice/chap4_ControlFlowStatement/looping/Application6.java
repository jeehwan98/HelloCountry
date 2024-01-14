package com.jee.JAVApractice.chap4_ControlFlowStatement.looping;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 토마토마토
         * */

        String str1 = "토";
        String str2 = "마";
        String result = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = sc.nextInt();


        for (int i = 1; i <= input; i++) {
            if(i % 2 != 0) {
                result += str1;
            } else {
                result += str2;
                }
        }
        System.out.println(result);





    }
}
