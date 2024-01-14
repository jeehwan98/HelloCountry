package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice4;

public class ShapeDTO {
    private int type;
    private double height;
    private double width;
    private String color;


    public ShapeDTO(int type, double height, double width) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.color = "white";
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
