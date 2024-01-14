package com.jee.JAVApractice.chap8_Inheritance.practice1again.Run;

import com.jee.JAVApractice.chap8_Inheritance.practice1again.DTO.EmployeeDTO;
import com.jee.JAVApractice.chap8_Inheritance.practice1again.DTO.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO sDTO[] = new StudentDTO[3];

        sDTO[0] = new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        sDTO[1] = new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        sDTO[2] = new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");

        for (int i = 0; i < sDTO.length; i++) {
            System.out.println(sDTO[i].information());
        }

        EmployeeDTO eDTO[] = new EmployeeDTO[10];


        int count = 0;

        while (true) {
            System.out.println("===== 정보 기록 =====");
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("키 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서 : ");
            String dept = sc.nextLine();
//            sc.nextLine();

            eDTO[count] = new EmployeeDTO(name, age, height, weight, salary, dept);

            count++; // 왜 추가 하는 것인가..?

            System.out.println("계속 추가 하실건가요? (y/n) : ");
            String add = sc.nextLine().toUpperCase();

            if (add.equals("N")) {
                break;
            }
        }

        for (int i = 0; i < count; i++) { // if eDT).length is inputted, it gives a null error...?
                System.out.println(eDTO[i].information());
        }
    }
//        PersonDTO pDTO = new PersonDTO();
}
