package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice3;

public class EmployeeDTO {

    private int number;
    private String name;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;

    EmployeeDTO() {}

    public EmployeeDTO(int number, String name, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.number = number;
        this.name = name;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    // getter
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public double getBonusPoint() {
        return bonusPoint;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // setter

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInformation() {
        System.out.println(this.number + ", " + this.name + ", " + this.dept + ", " + this.job + ", " + this.age + ", " + this.gender +", " + this.salary + ", " + this.bonusPoint + ", " + this.phone + ", " + this.address);
    }
}
