package com.jee.JAVApractice.chap4_ControlFlowStatement.looping;

import java.util.Scanner;

public class WhileExerciseAlone {

    public static void main(String[] args) {

//        int i = 0;
//        int sum = 0;
//        for(i = 0; i <= 5; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        int[] scores = new int[5];
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < scores.length; i++) {
//            System.out.print((i + 1) + "번째의 학생의 자바 점수를 입력 하세요 : ");
//            scores[i] = sc.nextInt();
//        }
//
//        int sum = 0;
//        for(int i = 0; i < scores.length; i++) {
//            sum+= scores[i];
//        }
//        int avg = (int) sum / scores.length;
//        System.out.println("sum of the scores : " + sum);
//        System.out.println("average score : " + avg);

                                                    /* 다시 */

        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);

        for( int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 째의 학생의 자바 점수는 : ");
            scores[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < scores.length; i++) {
            sum+= scores[i];
        }
        int avg = (int) sum / scores.length;
        System.out.println("sum of the scores : " + sum);
        System.out.println("average score : " + avg);

    }

}
