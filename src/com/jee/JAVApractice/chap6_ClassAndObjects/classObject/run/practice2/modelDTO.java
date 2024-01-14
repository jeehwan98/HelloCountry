package com.jee.JAVApractice.chap6_ClassAndObjects.classObject.run.practice2;

public class modelDTO {

    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    modelDTO() {}

    public modelDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public modelDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }
    // getter

    public String getTitle (String title) {
        return title;
    }
    public String getPublisher (String publisher) {
        return publisher;
    }
    public String getAuthor (String author) {
        return author;
    }
    public int getPrice (int price) {
        return price;
    }
    public double getDiscountRate (double discountRate) {
        return discountRate;
    }

    // setter

    public void setTitle() {
        this.title = title;
    }
    public void setPublisher() {
        this.publisher = publisher;
    }
    public void setAuthor() {
        this.author = author;
    }
    public void setPrice() {
        this.price = price;
    }
    public void setDiscountRate() {
        this.discountRate = discountRate;
    }

    public void printInformation() {
        System.out.println(this.title + ", " + this.publisher + ", " + this.author + ", " + this.price + ", " + this.discountRate);
    }

}
