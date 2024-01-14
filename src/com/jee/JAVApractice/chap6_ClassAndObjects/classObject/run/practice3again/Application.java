package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice3again;

public class Application {

    public static void main(String[] args) {
        EmployeeDTO emp = new EmployeeDTO(200,"홍길동","영업부","과장",29,'남',2000000,0.5,"010-1234-5678","서욼; 서초구 서초");
        System.out.println(emp);
        emp.information();
    }
}
