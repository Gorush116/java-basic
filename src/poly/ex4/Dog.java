package poly.ex4;

public class Dog extends AbstractAnimal {
    
    @Override
    public void sound() {
        System.out.println("왈왈");
    }

    @Override
    public void move() {
        System.out.println("개가 날렵하게 움직입니다.");
    }
}
