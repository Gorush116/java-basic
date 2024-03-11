package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        // 상속과 메모리 구조 반드시 머릿속에 넣을 것(안되면 복습)
        /*
            - 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다.
            - 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이 때, 호출자의 타입을 통해 대상 타입을 찾는다.
            - 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다. 기능을 찾지 못하면 컴파일 오류가 발생한다.
         */

        // ElectricCar 뿐 아니라 상속 관계에 있는 Car까지 함께 포함해서 인스턴스를 생성
        // -> 참조값은 하나이지만 실제 그 안에서는 Car, ElectricCar 두 가지 클래스가 존재(공간도 분리되어 있음)
        ElectricCar electricCar = new ElectricCar();
        // 1. 호출하는 변수의 타입(클래스)을 기준으로 선택
        electricCar.charge();
        // 1. 호출하는 변수의 타입(클래스)을 기준으로 선택 -> 2. 본인 타입에 없으면 부모 타입에서 찾기
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();
    }
}
