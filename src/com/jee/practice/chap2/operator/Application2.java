package com.jee.practice.chap2.operator;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 람쥐가 버스에 타서 탑승하는 승객을 구경합니다.
         * 탑승객의 나이를 정수로 하나 선언하고,
         * 나이가 13세 이하이면 어린이,
         * 13세초과 ~ 19세 이하이면 청소년,
         * 19세 초과이면 성인이라고 다음과 같이 출력되도록 작성하세요.
         *
         * 예1) 19 입력 ----------> 출력결과) 삐빅! 청소년 입니다~
         * 예2) 10 입력 ----------> 출력결과) 삐빅! 어린이 입니다~
         * 예3) 28 입력 ----------> 출력결과) 삡! 성인 입니다~
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        if (age < 13) {
            System.out.println("삐빅! 어린이");
        }
        else if (age < 19) {
            System.out.println("삐빅! 청소년");
        }
        else {
            System.out.println("삡! 성인!");
        }
    }
}
