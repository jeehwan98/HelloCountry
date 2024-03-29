package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice4;

import java.util.Scanner;

public class ShapeMenu {

    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        while (true) {

            System.out.println("=== 도형계산기 ===");
            System.out.println("3. 삼각형");
            System.out.println("4. 사각형");
            System.out.println("9. 프로그램 종료");
            System.out.print("계산하려는 도형을 선택하세요 : ");
            int num = sc.nextInt();

            if (num != 3 && num != 4 && num != 9) {
                System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요");
                continue;
            } else if (num == 9) {
                System.out.println("프로그램을 종료합니다");
                return;
            }

            System.out.print("도형의 높이를 입력하세요 : ");
            double height = sc.nextDouble();
            System.out.print("도형의 너비를 입력하세요 : ");
            double width = sc.nextDouble();

            ShapeDTO sDTO = new ShapeDTO(num, height, width);   // num = type 이랑 같기 때문이다

            switch (num) {                           // why sDTO.getType
                case 3: triangleMenu(sDTO); break;
                case 4: squreMenu(sDTO); break;
            }
        }
    }
    public void triangleMenu(ShapeDTO sDTO) {
        TriangleManager tm = new TriangleManager();
        while (true) {

            System.out.println("===== 삼각형 계산기 =====");
            System.out.println("1. 삼각형의 둘레 구하기");
            System.out.println("2. 삼각형의 면적 구하기");
            System.out.println("3. 선택한 도형 정보 출력하기");
            System.out.println("4. 도형의 색상 칠하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 : tm.calcPerimeter(sDTO); break;
                case 2 : tm.calcArea(sDTO); break;
                case 3 : tm.printShape(sDTO); break;
                case 4 : tm.paintColor(sDTO); break;
                case 9 : System.out.println("메인으로 돌아갑니다"); return;
                default: System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요"); break;
            }
        }
    }

    public void squreMenu(ShapeDTO sDTO) {
        SquareManager sm = new SquareManager();

        while (true) {

            System.out.println("===== 사각형 계산기 =====");
            System.out.println("1. 사각형의 둘레 구하기");
            System.out.println("2. 사각형의 면적 구하기");
            System.out.println("3. 선택한 도형 정보 출력하기");
            System.out.println("4. 도형의 색상 칠하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 : sm.calcPerimeter(sDTO); break;
                case 2 : sm.calcArea(sDTO); break;
                case 3 : sm.printShape(sDTO); break;
                case 4 : sm.paintColor(sDTO, inputColor()); break;
                case 9 : System.out.println("메인으 돌아갑니다"); return;
                default: System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요"); break;
            }
        }
    }
    private String inputColor() {
        System.out.print("어떤 색으로 도형을 칠할까요? : ");
        String color = sc.nextLine();
        return color;
    }
}
