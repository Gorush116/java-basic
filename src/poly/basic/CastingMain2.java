package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        // 단, 자식의 기능을 호출할 수 없다
//        poly.childMethod();

        // 부모는 자식을 담을 수 있지만, 반대는 불가능하다
        // 다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; // parent type -> child type cast 후 대입
        child.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 사용하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
        // 참조값을 꺼내고 꺼낸 참조값이 Child 타입이 됨 -> parent가 바뀌는게 아님!!!!

    }
}
