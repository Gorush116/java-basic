package ref;

public class InitMain {

    public static void main(String[] args) {
        InitData initData = new InitData();
        // 인스턴스의 멤버변수는 인스턴스 생성시 자동으로 초기화된다
        // 숫자(int) = 0, boolean = false, 참조형 = null(참조할 대상이 없음)
        System.out.println("value1 = " + initData.value1);
        System.out.println("value2 = " + initData.value2);
    }
}
