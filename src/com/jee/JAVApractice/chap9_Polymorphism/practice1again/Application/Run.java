package com.jee.JAVApractice.chap9_Polymorphism.practice1again.Application;

import com.jee.JAVApractice.chap9_Polymorphism.practice1again.Menu.LibraryMenu;

public class Run {


//  회원이 만화책 또는 요리책을 빌리려고 한다. 먼저 프로그램이 실행되면 회원의 인적 사항을 입력하고
//  회원등록을 해준다. 그 다음에 메뉴가 출력되면서 마이페이지, 도서전체조회, 도서검색, 도서대여 기능을
//  할 수 있다. 도서를 대여할 때 해당 도서가 만화책일 경우 나이제한이 있기 때문에 회원 나이와 만화책
//  의 제한 나이를 비교해야 되고, 대여할 도서가 요리책일 경우 해당 도서에 요리학원 쿠폰이 있으면 쿠폰
//  이 발급된다.
    public static void main(String[] args) {

        LibraryMenu libMenu = new LibraryMenu();
        libMenu.mainMenu();


    }
}
