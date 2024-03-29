package poly.ex5;

public interface InterfaceAnimal {

    // 추상클래스보다 인터페이스를 사용해야 하는 이유
    //  -> 추상 클래스의 경우 미래에 실행 가능한 메서드를 끼워넣을 수 있음 -> 더는 순수 추상 클래스가 아니게 됨
    //    (자바 8부터 default 메서드 사용시 인터페이스도 메서드 구현 가능하지만 아주 특별한 경우에만 사용해야 함. 나중에 알아보자)
    // -> 다중 구현 가능(왜? 인터페이스는 모두 추상 메서드로 이루어져있기 때문에)
    
    void sound(); // public abstract void sound(); 와 같음
    void move();

    // Interface abstract methods cannot have body
//    public void hello() {
//        System.out.println("안녕");
//    }
}
