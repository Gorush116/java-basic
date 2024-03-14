package extends1.super2;

public class ClassB extends ClassA {

//    public ClassB() { // 메서드 오버로딩시 기본생성자 사라짐 -> 별도 정의 필요
//    }

    public ClassB(int a) {
        // 상속을 받으면 생성자의 첫줄에 super(...)를 사용해서 부모 클래스의 생성자를 호출해야 한다
        // 예외 : super대신 this를 첫 줄에 사용가능하지만, 생성자 내에서 반드시 super를 호출해야 함
        super(); // 기본 생성자 생략 가능
        System.out.println("classB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("classB 생성자 a = " + a + ", b = " + b);
    }
}
