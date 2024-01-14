package com.jee.JAVApractice.chap2_Operator.operator;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 서울에서 패스트푸드의 늪에 빠진 람쥐가 몸무게를 잽니다.
         * 몸무게가 12kg 이상이면 비만이라고 출력되도록,
         * 아니면 정상이라고 출력되로록 작성하세요. (삼항 연산자 사용)
         *
         * 예) 7 입력
         *
         * ---- 출력 결과 ---
         * 정상!!!!!
         * */

        int weight = 13;

        if (weight >= 12) {
            System.out.println("비만!!");
        } else {
            System.out.println("정상!!");
        }
    }
}
