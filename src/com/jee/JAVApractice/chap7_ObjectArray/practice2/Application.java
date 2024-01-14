package com.jee.JAVApractice.chap7_ObjectArray.practice2;

public class Application {

    public static void main(String[] args) {


        StudentDTO sDTO[] = new StudentDTO[3];

        sDTO[0] = new StudentDTO(1,5,"홍길동",40,60,70);
        sDTO[1] = new StudentDTO(2,1,"김말똥",70,80,100);
        sDTO[2] = new StudentDTO(3,3,"강개순",100,75,86);

//        sDTO[count] = new StudentDTO()
        int i = 0;
        while (true) {
            if (i >= sDTO.length) {
                break;
            }
                System.out.println("sto{" + i + "] : " + sDTO[i].information());
                i++;

        }
    }
}
