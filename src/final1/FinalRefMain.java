package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // data의 참조값이 변하지 않도록 final 선언

        // final로 선언한 인스턴스는 재할당 불가
        // data = new Data(); // cannot assign a value to final variable data

        // final 인스턴스 내 필드는 변경 가능
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
        
        // 왜? value는 final이 아님
        // Data의 참조값이 final이기 때문에 다른 객체를 참조할 수 없음 -> "참조값"만 변경할 수 없음
    }
}
