package com.jee.JAVApractice.chap7_ObjectArray.practice1;

public class Application {

    public static void main(String[] args) {


        EmployeeDTO eDTO[] = new EmployeeDTO[3]; // 3개의 생성

        eDTO[0] = new EmployeeDTO();
//        eDTO[1] = new EmployeeDTO(1, "홍길동", 19, 'M',"01022223333", "서울 잠실");
        eDTO[1] = new EmployeeDTO(1, "홍길동", "체육부", "학생", 19, 'M', 50000, 0.03, "01022223333", "서울 잠실");
        eDTO[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 100000, 0.01, "01011112222", "서울 마곡" );

        for (int i = 0; i < eDTO.length; i++) {
            System.out.println("eDTO[" + i + "] : " + eDTO[i].getInformation());
        }
        System.out.println("=========");

        int sum = 0;

        for (int i = 0; i < eDTO.length; i++) {
            int sumSalary = (int) (eDTO[i].getSalary() + (eDTO[i].getSalary() * eDTO[i].getBonusPoint()) * 12);
            System.out.println(eDTO[i].getEmpName() + "의 연봉은 : " + sumSalary + "원 입니다.");

        sum += sumSalary;
        }


    }
}
