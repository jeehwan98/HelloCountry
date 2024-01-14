package com.jee.JAVApractice.chap8_Inheritance.practice1_extra;

public class Student extends Person{

    private int grade;
    private String major;

    public Student() {
    }

    public Student(int grade, String major) {
        this.grade = grade;
        this.major = major;
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
//        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }
}
