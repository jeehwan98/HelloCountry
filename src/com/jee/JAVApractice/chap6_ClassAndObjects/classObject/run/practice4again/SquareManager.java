package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice4again;

import java.util.Scanner;

public class SquareManager {
    Scanner sc = new Scanner(System.in);


    public void calcPerimeter(ShapeDTO shape) {
        double height = shape.getHeight();
        double width = shape.getWidth();
        double perimeter = 2 * (height + width);
        System.out.println("사각형의 둘레는 " + perimeter + "입니다");
    }

    public void calcArea(ShapeDTO shape) {
        double height = shape.getHeight();
        double width = shape.getWidth();
        double area = height * width;
        System.out.println("사각형의 면적은 " + area + "입니다");
    }

    public void printShape(ShapeDTO shape) {
        System.out.println("도형의 타입 : 사각형");
        System.out.println("높이 : " + shape.getHeight());
        System.out.println("너비 : " + shape.getWidth());
        System.out.println("색상 : " + shape.getColor());
    }

    public void paintColor(ShapeDTO shape) {
        System.out.print("어떤 색으로 도형을 칠할까요? : ");
        String color = sc.next();
        shape.setColor(color);
        System.out.println("선택하신 도형을 " + color + "로 색칠합니다");
    }

}
