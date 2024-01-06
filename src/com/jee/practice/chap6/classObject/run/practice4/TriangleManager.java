package com.jee.practice.chap6.classObject.run.practice4;

import com.jee.practice.chap6.classObject.run.practice4.ShapeDTO;

public class TriangleManager {

    public void calcPerimeter(ShapeDTO sDTO) {
        double height = sDTO.getHeight();
        double width = sDTO.getWidth();
        double temp = Math.sqrt(height * height + width * width);
        double perimeter = height + width + temp;

        System.out.println("삼각형의 둘레는 " + perimeter + " 입니다.");
    }

    public void calcArea(ShapeDTO sDTO) {
        double height = sDTO.getHeight();
        double width = sDTO.getWidth();

        double area = height * width / 2;

        System.out.println("삼각형의 면적은 " + area + " 입니다.");

    }

    public void printShape(ShapeDTO sDTO) {
        System.out.println("도형 타입 : 삼각형");
        System.out.println("높이 : " + sDTO.getHeight());
        System.out.println("넓이 : " + sDTO.getWidth());
        System.out.println("색상 : " + sDTO.getColor());
    }

    public void paintColor(ShapeDTO sDTO) {
//        sDTO.setColor(color);

//        System.out.println("선택하신 도형을 " + color + "으로 색칠합니다.");
    }
}
