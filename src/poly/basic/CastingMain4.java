package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent = new Child();
        Child child1 = (Child) parent;
        child1.childMethod();

        Parent parent2 = new Parent();
        // parent2 인스턴스에는 Child에 대한 정보가 존재하지 않음
//        Child child2 = (Child) parent2;  // runtime error, ClassCastException 발생
//        child2.childMethod(); // 실행 불가

        Number number = 1;
        Integer integer = (Integer) number;
//        System.out.println("integer = " + integer);

        Number number2 = new Integer(2);
        Integer integer1 = (Integer) number2;
        System.out.println("integer1 = " + integer1);
    }
}
