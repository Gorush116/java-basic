package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20); // 기본생성자 존재하지 않을시 직접 정의
        System.out.println("ClassC 생성자");
    }
}
