package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴인 경우 childMethod() 실행
        if (parent instanceof Child child) { // 변수 선언을 동시에 할 수 있음(Java 16~)
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        } 
    }
}
