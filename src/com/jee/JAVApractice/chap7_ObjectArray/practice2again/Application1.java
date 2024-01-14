package com.jee.JAVApractice.chap7_ObjectArray.practice2again;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO sDTO[] = new StudentDTO[10];

        int count = 0;

        while (true) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            sDTO[count] = new StudentDTO(grade,classroom,name,kor,eng,math); // store the information

            count++; // count

            System.out.print("계속 추가하시겠습니까? (y/n) : "); // get the inputted value
            String choice = sc.nextLine().toUpperCase(); // convert the Y/N to an uppercase.

            if (choice.equals("N")) { // if N = stop... if Y = continue
                break;
            }


            for(int i = 0; i < sDTO.length; i++) {
                int averageScore = (sDTO[i].getKor() + sDTO[i].getEng() + sDTO[i].getMath())/sDTO.length; // 학생의 평균 점수 구하기
                System.out.println(sDTO[i].information() + "평균점수 : " + averageScore);
            }
        }
    }
}
