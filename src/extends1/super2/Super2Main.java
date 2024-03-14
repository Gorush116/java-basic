package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {
        // 생성자의 실행순서는 최상위 부모부터 실행 -> 초기화도 최상위 부모부터 이루어짐
        ClassC classC = new ClassC();


    }
}
