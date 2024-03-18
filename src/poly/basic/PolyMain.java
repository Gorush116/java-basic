package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent(); // 부모 인스턴스는 메모리 상에 부모만 생성됨(자식 생성되지 않음)
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child(); // 자식 인스턴스는 메모리 상에 부모와 같이 생성됨
        child.childMethod();

        // 부모는 자식을 담을 수 있다(반대는 컴파일 오류 발생)
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 인스턴스 생성시 자식 인스턴스를 생성했기 때문에 부모와 자식이 포함됨
        poly.parentMethod();
//        poly.childMethod(); // poly는 Parent 타입으로 선언했기 때문에 childMethod를 호출할 수 없다

//        Child child2 = new Parent(); // 자식은 부모를 담을 수 없다
        
        /*
            다형적 참조를 하는 이유
            - 참조의 순서가 달라짐
            - child에서 parent를 호출시 참조순서가  child -> parent로 넘어가지만
            - poly에서 parent 호출시 참조순서가 바로 parent로 참조됨
         */



    }
}
