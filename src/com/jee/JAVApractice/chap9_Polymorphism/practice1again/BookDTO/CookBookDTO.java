package com.jee.JAVApractice.chap9_Polymorphism.practice1again.BookDTO;


public class CookBookDTO extends BookDTO {

    private boolean coupon;

    public CookBookDTO() {
    }

    public CookBookDTO(String title, String author, String publisher, boolean coupon) {
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
        return super.toString() + "CookBookDTO{" + "coupon=" + coupon + '}';
    }
}
