package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경(k3 -> model3)
        driver.setCar(new Model3Car());
        driver.drive();

        // 차량 변경(model3 -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
        
        // 전략 패턴 : 클라이언트 코드(Driver)를 변경하지 않고 알고리즘을 쉽게 교체할 수 있는 디자인 패턴
    }
}
