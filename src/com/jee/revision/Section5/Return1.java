package com.jee.revision.Section5;

public class Return1 {

    public static void main(String[] args) {


        System.out.print("main() 메소드 시작함...");

        Return1 app = new Return1();
        app.testMethod();
        System.out.print("main() 메소드 종료됨...?");

    }

    public void testMethod() {
        System.out.println("testMethod() 동작 확인...");
    }
}