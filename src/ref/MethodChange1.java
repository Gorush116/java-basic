package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        // 자바는 항상 변수의 값을 복사해서 대입한다!
        int a = 10;
        System.out.println("a = " + a);
        changePrimitive(a);
        System.out.println("a = " + a);
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
