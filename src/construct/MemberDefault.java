package construct;

public class MemberDefault {
    String name;

    MemberDefault() { // public MemberDefault()
        // 직접 정의한 생성자가 하나라도 존재하면 기본 생성자가 만들어지지 않음
        System.out.println("기본생성자 호출");
    }
}
