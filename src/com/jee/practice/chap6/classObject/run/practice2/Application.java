package com.jee.practice.chap6.classObject.run.practice2;

public class Application {

    public static void main(String[] args) {

        modelDTO mDTO1 = new modelDTO();
        mDTO1.printInformation();

        modelDTO mDTO2 = new modelDTO("자바의 정석", "도우출판", "남궁성", 0, 0.0);
        mDTO2.printInformation();

        modelDTO mDTO12 = new modelDTO("홍길동전", "활빈당", "허균", 500000, 0.5);
        mDTO12.printInformation();
//        System.out.println();

    }
}
