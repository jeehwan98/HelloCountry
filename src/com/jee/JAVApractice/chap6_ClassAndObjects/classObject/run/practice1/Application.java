package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice1;

public class Application {
    public static void main(String[] args) {


        MemberDTO mDto = new MemberDTO();

        System.out.println(mDto.getId()); // set하기 전
        System.out.println(mDto.getPwd());
        System.out.println(mDto.getName());
        System.out.println(mDto.getAge());
        System.out.println(mDto.getGender());
        System.out.println(mDto.getPwd());
        System.out.println(mDto.getEmail());


        mDto.setId("user01");
        mDto.setPwd("pass01");
        mDto.setName("홍길동");
        mDto.setAge(27);
        mDto.setGender('남');
        mDto.setPhone("01076569003");
        mDto.setEmail("jeehwan98@naver.com");

        System.out.println("변경후 : " + mDto.getId());
        System.out.println("변경후 : " + mDto.getPwd());
        System.out.println("변경후 : " + mDto.getName());
        System.out.println("변경후 : " + mDto.getAge());
        System.out.println("변경후 : " + mDto.getGender());
        System.out.println("변경후 : " + mDto.getPwd());
        System.out.println("변경후 : " + mDto.getEmail());
    }
}
