package extends1.overriding;

import extends1.ex1.GasCar;

public class CarMain {

    public static void main(String[] args) {

        /*
            메서드 오버라이딩 조건
            - 메서드 이름 일치
            - 메서드 매개변수(파라미터) : 타입, 순서, 개수 일치
            - 반환 타입이 같아야 함
            - 접근 제어자 : 상위 클래스의 메서드보다 제한적이지 않아야 함 
                EX) 부모 : protected / 자식 : protected, public 사용 가능
            - static, final, private 키워드 붙은 메서드 오버라이딩 불가능
                - static : 클래스 레벨에서 작동(인스턴스 레벨에서 작동하는 오버라이딩은 의미 없음)
                - final : 재정의 금지
                - private : 해당 클래스 내부에서만 접근 가능
            - 생성자 오버라이딩 불가  
         */
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 재정의된 메소드가 실행됨
        // 1. ElectricCar 에서 move 메소드 탐색

        GasCar gasCar = new GasCar();
        gasCar.move();
        // 1. GasCar 에서 move 탐색 -> 2. GasCar 에 move 메서도 존재하지 않을 때, Car에서 move 탐색
    }
}
