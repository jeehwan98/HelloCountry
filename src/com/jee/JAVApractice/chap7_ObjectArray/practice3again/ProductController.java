package com.jee.JAVApractice.chap7_ObjectArray.practice3again;

import java.util.Scanner;

public class ProductController {

    Scanner sc = new Scanner(System.in);
    ProductDTO pDTO[] = new ProductDTO[10];

    public void mainMenu() {

        int menu = 0;
        do {
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1 : productInput(); break;
                case 2 : productPrint(); break;
                case 9 : System.out.println("시스템을 종료합니다"); break;
                default: System.out.println("잘못 입력했습니다. 다시 선택해주세요"); break;

            }
        } while (menu != 9);
    }
        public void productInput () {

            int count = 0;
            System.out.println("===== 정보 추가 메뉴 =====");
            System.out.print("제품 번호 : ");
            int pld = sc.nextInt();
            sc.nextLine();
            System.out.print("제품명 : ");
            String pName = sc.nextLine();
            System.out.print("제품 가격 : ");
            int price = sc.nextInt();
            System.out.print("제품 세금 : ");
            double tax = sc.nextDouble();

            pDTO[count] = new ProductDTO(pld,pName,price,tax);
        }

        public void productPrint () {

        for (int i = 0; i < pDTO.length; i++) {
            System.out.println(pDTO[i].information());
        }
    }
}
