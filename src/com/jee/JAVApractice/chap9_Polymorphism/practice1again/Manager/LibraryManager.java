package com.jee.JAVApractice.chap9_Polymorphism.practice1again.Manager;

import com.jee.JAVApractice.chap9_Polymorphism.practice1again.BookDTO.AniBookDTO;
import com.jee.JAVApractice.chap9_Polymorphism.practice1again.BookDTO.BookDTO;
import com.jee.JAVApractice.chap9_Polymorphism.practice1again.BookDTO.CookBookDTO;
import com.jee.JAVApractice.chap9_Polymorphism.practice1again.Member.Member;

public class LibraryManager {

//    Member member = new Member();
    private Member member = null;
    BookDTO bookList[] = new BookDTO[5];

    {
        bookList[0] = new CookBookDTO("백종원의 집밥", "백종원", "tvN", true);
        bookList[1] = new AniBookDTO("한번 더 해요", "미티", "원모어", 19);
        bookList[2] = new AniBookDTO("루피의 원피스", "루피", "japan", 12);
        bookList[3] = new CookBookDTO("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bookList[4] = new CookBookDTO("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember() {

    }

    public void myInfo() {

    }

    public BookDTO[] selectAll() {
        return this.bookList;
        }
    }









}
