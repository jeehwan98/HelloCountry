package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice3;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO eDTO = new EmployeeDTO(200,"홍길동","영업부","과장",20,'남',200000,0.5,"010-1234-5678","서울시 서초구 서초");
        eDTO.printInformation();
    }
}
