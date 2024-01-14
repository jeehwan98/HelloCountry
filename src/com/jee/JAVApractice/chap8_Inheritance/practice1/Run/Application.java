package com.jee.JAVApractice.chap8_Inheritance.practice1.Run;

import com.jee.JAVApractice.chap8_Inheritance.practice1.DTO.EmployeeDTO;
import com.jee.JAVApractice.chap8_Inheritance.practice1.DTO.StudentDTO;

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

        EmployeeDTO eDTO1[] = new EmployeeDTO[10];
        int count = 0;
        while (true) {
            System.out.print("name : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("키 : ");
            double height = sc.nextDouble();
            System.out.print("무게 : ");
            double weight = sc.nextDouble();
            System.out.print("연봉 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("전공 : ");
            String major = sc.nextLine();


            eDTO1[count] = new EmployeeDTO(name,age,height,weight,salary,major);

            count++;
            System.out.println("계속 추가할 건가요? (y/n) : ");
            char yesOrNo = sc.nextLine().toUpperCase().charAt(0);

            if (yesOrNo == 'N') {
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(eDTO1[i].information());
        }
    }
}
