package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice4again;

import java.util.Scanner;

public class ShapeMenu {

    Scanner sc = new Scanner(System.in);
    SquareManager sm = new SquareManager();
    TriangleManager tm = new TriangleManager();
    ShapeDTO sDTO = new ShapeDTO();

    public void mainMenu() {

        while (true) {
            System.out.println("============ 도형계산기 ============");
            System.out.println("3. 삼각형");
            System.out.println("4. 사각형");
            System.out.println("9. 프로그램 종료");
            System.out.print("계산하려는 도혀을 선택하세요 : ");
            int menu = sc.nextInt();

            if (menu != 3 && menu != 4 && menu != 9) {
                System.out.println("잘못 입력된 값입니다. 다시 입력해주세요");
                continue;
            } else if (menu == 9) {
                System.out.println("프로그램을 종료합니다");
                return; // not break!!!!
            }

            System.out.print("도형의 높이를 입력하세요 : ");
            double height = sc.nextDouble();
            sDTO.setHeight(height);
            System.out.print("도형의 너미를 입력하세요 : ");
            double width = sc.nextDouble();
            sDTO.setWidth(width);

//            ShapeDTO sdTO = new ShapeDTO(menu, height, width); // setting the information

//            switch (menu) {
//            switch (sdTO.getType()) {
            switch (menu) {
//                case 3 : triangleMenu(sdTO); break;
//                case 4 : squareMenu(sdTO); break;
                case 3 : triangleMenu(sDTO); break;
                case 4 : squareMenu(sDTO); break;
            }

//            } else if (menu == 9) {
//                System.out.println("프로그램을 종료합니다");
//                break;
//            } else {
//                System.out.println("잘못 입력된 값입니다. 다시 입력해주세요"); break;
//            }
        }
    }

    public void squareMenu(ShapeDTO shape) {

        while (true) {
            System.out.println("========== 사각형 계산기==========");

            System.out.println("1. 사각형의 둘레 구하기");
            System.out.println("2. 사각형의 면적 구하기");
            System.out.println("3. 선택한 도형 정보 출력하기");
            System.out.println("4. 도형의 색상 칠하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴를 선택하세요 : ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1 : sm.calcPerimeter(shape); break;
                case 2 : sm.calcArea(shape); break;
                case 3 : sm.printShape(shape); break;
                case 4 : sm.paintColor(shape); break;
                case 9 : System.out.println("메인으로 돌아갑니다"); return;
            }
        }
    }

    public void triangleMenu(ShapeDTO shape) {
        while (true) {
            System.out.println("========== 삼각형 계산기==========");
            System.out.println("1. 삼각형의 둘레 구하기");
            System.out.println("2. 삼각형의 면적 구하기");
            System.out.println("3. 선택한 도형 정보 출력하기");
            System.out.println("4. 도형의 색상 칠하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴를 선택하세요 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 : tm.calcPerimeter(shape); break;
                case 2 : tm.calcArea(shape); break;
                case 3 : tm.printShape(shape); break;
                case 4 : tm.paintColor(shape); break;
                case 9 : System.out.println("메인으로 돌아갑니다"); return;
                default: System.out.println("잘못 선택했습니다. 메뉴를 다시 선택해주세요"); break;
            }
        }
    }
}
