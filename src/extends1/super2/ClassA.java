package extends1.super2;

public class ClassA {

    // 상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다(규칙)
    public ClassA() {
        System.out.println("ClassA 생성자");
    }
}
