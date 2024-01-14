package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice2again;

public class Application {
    public static void main(String[] args) {

        BookDTO bookdto = new BookDTO();
        bookdto.printInformation();

        BookDTO bto1 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bto1.printInformation();

        BookDTO bookdto2 = new BookDTO("홍길동전","활빈당","허균",5000000, 0.5);
        bookdto2.printInformation();

    }

}
