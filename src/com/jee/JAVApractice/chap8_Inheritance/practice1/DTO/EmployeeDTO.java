package com.jee.JAVApractice.chap8_Inheritance.practice1.DTO;

public class EmployeeDTO extends PersonDTO{

    private int salary;
    private String dept;

    public EmployeeDTO() {}

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String information() {
        return super.information() + ", salary : " + this.salary + ", dept : " + this.dept;
    }
}
