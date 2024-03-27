package poly.ex4;

public class Cow extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 당차게 움직입니다.");
    }
}
