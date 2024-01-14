package com.jee.JAVApractice.chap8_Inheritance.practice1_extra;

public class Employee extends Person{

    private int salary;
    private String dept;

    public Employee() {
    }

    public Employee(int salary, String dept) {
        this.salary = salary;
        this.dept = dept;
    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
//        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
