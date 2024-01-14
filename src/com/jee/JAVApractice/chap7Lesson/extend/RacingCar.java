package com.jee.JAVApractice.chap7Lesson.extend;

public class RacingCar extends Car {


    public RacingCar() {
        System.out.println("RacingCar 클래스의 기본생성자 호출");
    }

    @Override
    public void run() {
        System.out.println("겁나 빨리 달리는 중 썌앵~~~~~!");
    }

    @Override
    public void soundHorn() {
    System.out.println("경주용 자동차는 경적을 울리지 않는데...");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카 멈춤.");
    }
}


