package com.jee.practice.chap4.conditional;

import java.util.Scanner;

public class Application7 {

    public static void main(String[] args) {

        /* 람쥐는 축제 부스에서 일한 뒤, 인사평가 점수를 받았습니다.
         *
         * 성실, 서비스, 미소 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
         *
         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해 주어야 합니다.
         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다."라고 출력하고,
         * 항목당 과락 점수가 있는 경우 "xx 항목의 점수 미달로 불합격 입니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 성실 점수 : 60
         * 서비스 점수 : 30
         * 미소 점수 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 서비스 점수 미달로 불합격입니다.
         * 미소 점수 미달로 불합격입니다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("성실 점수 : ");
        int diligenceScore = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int serviceScore = sc.nextInt();
        System.out.print("미소 점수 : ");
        int smileScore = sc.nextInt();

        int totalScore = diligenceScore + serviceScore + smileScore;
        int averageScore = totalScore / 3;
        int minScore = Math.min(Math.min(diligenceScore, serviceScore), smileScore);
//        return Math.min(Math.min(diligenceScore,smileScore),serviceScore); trying to find which subject is the lowest score
//        if (averageScore >= 60 && minScore >= 40) {                   // minScore >= 40 ... redundant
        if (averageScore >= 60) {                                       // average score > 60 and minimum score > 40 as well
            System.out.println("합격입니다!");
            if (minScore < 40) {                  // average score > 60 but minimum score < 40
                if (diligenceScore < 40) {
                    System.out.println("성실 점수 미달로 불합격입니다");
                    if (serviceScore < 40) {
                        System.out.println("서비스 점수 미달로 불합격입니다");
                        if (smileScore < 40) {
                            System.out.println("미소 점수 미달로 불합격입니다");
                        } else {
                            System.out.println("불합격 입니다");
                        }
                    }
                }
            }
        }
        if (averageScore < 40) {
            System.out.println("평균점수 미달로 불합격입니다");
        }
        if (diligenceScore < 40) {
            System.out.println("성실 점수 미달로 불합격입니다");
        }
        if (serviceScore < 40) {
            System.out.println("서비스 점수 미달로 불합격입니다");
        }
        if (smileScore < 40) {
            System.out.println("미소 점수 미달로 불합격입니다");
        }
    }
}





//        } else if (averageScore >= 60 && minScore < 40) {           // average score > 60 but minimum score < 40
////            System.out.println("평균 점수는 넘었으나 " + minScore + " 항목의 점수 미달로 불합격 입니다.");
//            if (diligenceScore < 40) {
//                System.out.println("성실 점수 미달로 불합격입니다");
//            } else if (serviceScore < 40) {
//                System.out.println("서비스 점수 미달로 불합격입니다.");
//            } else {
//                System.out.println("미소 점수 미달로 불합격입니다.");
//            }
//        }
//        if (averageScore < 60) {                                   // average score < 60, print the scores that are < 40
//            System.out.println("평균 점수 미달로 불합격입니다.");
//        } else if (diligenceScore < 40) {
//            System.out.println("성실 점수 미달로 불합격입니다");
//        } else if (serviceScore < 40) {
//            System.out.println("서비스 점수 미달로 불합격입니다.");
//        } else if (smileScore < 40) {
//            System.out.println("미소 점수 미달로 불합격입니다.");
//        }
//    }
//}
