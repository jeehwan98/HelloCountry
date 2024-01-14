package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice4;

public class SquareManager {


    public void calcPerimeter(ShapeDTO sDTO) {
        double height = sDTO.getHeight();
        double width = sDTO.getWidth();
        double perimeter = 2 * (height + width);

        System.out.println("사각형의 둘레는 : " + perimeter);
    }

    public void calcArea(ShapeDTO sDTO) {
        double height = sDTO.getHeight();
        double width = sDTO.getWidth();
        double area = height * width;

        System.out.println("사각형의 면적은 : " + area);
    }

    public void printShape(ShapeDTO sDTO) {
        double height = sDTO.getHeight();
        double width = sDTO.getWidth();
        String color = sDTO.getColor();
        System.out.println("도형 타입 : 사각형");
        System.out.println("사각형의 높이 : " + height);
        System.out.println("사각형의 너비 : " + width);
        System.out.println("색상 : " + color);
    }

    public void paintColor(ShapeDTO sDTO, String color) {
        System.out.println("선택하신 도형을 " + color + "로 색칠합니다");
    }

}
