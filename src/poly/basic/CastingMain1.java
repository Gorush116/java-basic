package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        // 단, 자식의 기능을 호출할 수 없다
//        poly.childMethod();

        // 부모는 자식을 담을 수 있지만, 반대는 불가능하다
        // 다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; // parent type -> child type cast 후 대입
        // poly의 초기 참조값은 그대로 가되, 인스턴스의 내용이 바뀜
        child.childMethod();
    }
}
