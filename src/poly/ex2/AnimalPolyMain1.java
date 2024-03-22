package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        dog.superSound();

        System.out.println("1234");
        Animal ani = new Cat();
        ani.sound();
        ani.test();
//        ani.catTest(); // 에러 발생
        ((Cat) ani).catTest();

    }


    /**
     * 부모는 자식을 품을 수 있다
     * Animal은 부모 클래스이기 때문에 자식 클래스에 대한 다형적 참조가 가능
     * @param animal
     */
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 오버라이딩된 메서드는 항상 우선권을 가진다
        System.out.println("동물 소리 테스트 종료");
    }
}
