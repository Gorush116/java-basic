package pack.b;

public class User {
    
    public User() { // 다른 패키지에서 해당 클래스를 사용하려면 public 접근제어자를 사용해야 함
        System.out.println("패키지 pack.b 회원 생성");
    }
}
