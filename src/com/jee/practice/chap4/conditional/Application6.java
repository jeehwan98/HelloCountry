package com.jee.practice.chap4.conditional;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /* 람쥐는 축제 간식 부스에서 일하게 됐어요.
         *
         * 간식 이름("캬라멜팝콘", "츄로스", "통감자", "도토리탕후루") 중 한 가지를 문자열로 입려하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         *
         * 단, 목록에 없는 과일을 입력 시 "해당 상품이 판매하지 않습니다." 출력 후 프로그램을 종료합니다.
         *
         * -- 상품 가격 --
         * 캬라멜팝콘 : 15500원
         * 츄로스 : 3000원
         * 통감자 : 2000원
         * 도토리탕후루 : 5000원
         *
         * -- 입력 예시 --
         * 어떤 간식을 주문하시겠어요? 도토리탕후루
         *
         * -- 출력 예시 --
         * 도토리탕후루의 가격은 5000원 입니다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 간식을 주문하시겠어요?");
        String snack = sc.next();

        int price = 0;

        switch (snack) {
            case "카라멜팝콘":
                price = 15500; break;
            case "츄로스":
                price = 3000; break;
            case "통감자":
                price = 2000; break;
            case "도토리탕후루":
                price = 5000; break;
            default:
                System.out.println("해당 상품은 판매하지 않습니다"); return;
        }
        System.out.println(snack + "의 가격은 " + price + "원 입니다");
    }
}
