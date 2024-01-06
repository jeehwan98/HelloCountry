package com.jee.practice.chap8;

public class PersonDTO {

    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO() {}

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String information() {
        return "name : " + this.name + ", age : " + this.age + ", height : " + this.height + ", weight : " + this.weight;
    }
}
