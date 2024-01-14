package com.jee.JAVApractice.chap7Lesson.extend;

public class Car {

    private boolean runningStatus;                  // 외부에서 수정이 불가능해야한다

    public Car() {
        System.out.println("Car 클래스의 기본생성자 호출");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달리는 중~");
    }

    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빵빵!");
        } else {
            System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }

    private boolean isRunning() {
        return this.runningStatus;
    }

    public void stop() {
        this.runningStatus = false;
        System.out.println("자동차가 멈춤.");
        }
    }
