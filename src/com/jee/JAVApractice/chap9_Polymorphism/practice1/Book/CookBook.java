package com.jee.JAVApractice.chap9_Polymorphism.practice1.Book;

public class CookBook extends Book {

    private boolean coupon;

    public CookBook() {
    }

    public CookBook(boolean coupon) {
        this.coupon = coupon;
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }




    @Override
    public String toString() {
        return "CookBook{" + super.toString() + "coupon=" + coupon + '}'; // super.toString !!
    }
}
