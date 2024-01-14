package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice1again;

public class Application {

    public static void main(String[] args) {
        MemberDTO mDTO = new MemberDTO();

        System.out.println(mDTO.getId());
        System.out.println(mDTO.getPwd());
        System.out.println(mDTO.getName());
        System.out.println(mDTO.getAge());
        System.out.println(mDTO.getGender());
        System.out.println(mDTO.getPhone());
        System.out.println(mDTO.getEmail());

//        mDTO.toString("user01", "pass01", "홍길동", 20, 'M', "010-1234-5678","hong123@ohgiraffers.com");
//        System.out.println(mDTO.getId());

        mDTO.setId("user01");
        mDTO.setPwd("pass01");
        mDTO.setName("홍길동");
        mDTO.setAge(27);
        mDTO.setGender('남');
        mDTO.setPhone("01076569003");
        mDTO.setEmail("jeehwan98@naver.com");

        System.out.println("변경후 : " + mDTO.getId());
        System.out.println("변경후 : " + mDTO.getPwd());
        System.out.println("변경후 : " + mDTO.getName());
        System.out.println("변경후 : " + mDTO.getAge());
        System.out.println("변경후 : " + mDTO.getGender());
        System.out.println("변경후 : " + mDTO.getPwd());
        System.out.println("변경후 : " + mDTO.getEmail());

    }
}
