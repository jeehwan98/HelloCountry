package com.jee.JAVApractice.chap9_Polymorphism.practice1again.Menu;

import com.jee.JAVApractice.chap9_Polymorphism.practice1again.BookDTO.BookDTO;
import com.jee.JAVApractice.chap9_Polymorphism.practice1again.Manager.LibraryManager;
import com.jee.JAVApractice.chap9_Polymorphism.practice1again.Member.Member;

import java.util.Scanner;

public class LibraryMenu {

    LibraryManager libmanager = new LibraryManager();
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {

        System.out.print("이름를 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);

        Member member = new Member(name,age,gender); // store info.

        while (true) { // 다시 돌아오게
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 : libmanager.myInfo(member); break; // use the info that was inputted
                case 2 : selectAll(); break;
                case 3 : searchBook(); break;
                case 4 : rentBook(); break;
                case 0 : System.out.println("프로그램을 종료합니다"); break;
                default: System.out.println("없는 선택지입니다. 다시 입력해주세요"); return;
            }
        }
    } // 끝

    public void selectAll() { // libraryManager에서 selectAll method 호출... for문 통해 도서 전체 목록 출력
        libmanager.selectAll(); // 호출
        BookDTO booklist[] = new BookDTO[];


    }

    public void searchBook() {

    }

    public void rentBook() {


        System.out.print("대여할 도서 번호 선택 : ");
    }



}
