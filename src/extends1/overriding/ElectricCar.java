package extends1.overriding;

import extends1.ex3.Car;

public class ElectricCar extends Car {
    
    // 오버라이딩 없이도 사용할 수 있지만, 오버라이드 어노테이션 사용시 재정의된 메소드가 확실히 식별됨
    @Override
    public void move() {
        System.out.println("오버라이딩한 전기차를 이동합니다.");
    }
    public void charge() {
        System.out.println("차를 충전합니다.");
    }
}
