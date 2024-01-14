package com.jee.JAVApractice.chap9_Polymorphism.practice1.Member;

public class Member {

    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member() {
    }

    public Member(String name, int age, char gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", couponCount=" + couponCount +
                '}';
    }
}
