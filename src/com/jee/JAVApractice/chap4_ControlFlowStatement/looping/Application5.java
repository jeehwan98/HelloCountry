package com.jee.JAVApractice.chap4_ControlFlowStatement.looping;

public class Application5 {

    public static void main(String[] args) {

        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요.
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char)i); // have to write a char in order to print just the letter itself and not the ASCII.
        }
    }
}
