package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {
    // AbstractAnimal을 상속받고 Fly를 구현(부모가 2)
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
