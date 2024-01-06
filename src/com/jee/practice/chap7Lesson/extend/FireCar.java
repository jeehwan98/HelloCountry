package com.jee.practice.chap7Lesson.extend;

public class FireCar extends Car {

    public FireCar() {
        super();
        System.out.println("FireCare 클래스의 기본생성자 호출");
    }

    /*
    * @Override 어노테이션
    * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
    * (= 오버라이딩이 정상적으로 작성되었는지 체크해 주는 기능)
    * 오버라이딩하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
    * */
//    @Override
//    public void soundHorn() {
//        super.soundHorn();                                      // 부모를 호출한다
//    public void soundHorn() {
//        if (isRunning()) {
//            System.out.println("빵!!!!!빵!!!!! 빠아아앙!!!!!");
//        }
//    } else {
//        System.out.println("소방차가 앞으로 갈 수 없습니다, 비켜주세요~!");
//    }


//    @Override
//    public void soundHorn() {
//        if(isRunning()) {
//            System.out.println("빵!!!!빵!!!!!빠아아앙!!!!1");
//        }
//    }
}
