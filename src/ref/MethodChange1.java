package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        // 자바는 항상 변수의 값을 복사해서 대입한다!
        int a = 10;
        System.out.println("a = " + a);
        changePrimitive(a);
        System.out.println("a = " + a);
        // 업무 파악은 머릿 속으로 큰 그림을 먼저 그리고 프로세스를 파악한 뒤 디테일을 챙긴다
        // 에러 발생시 여러 부분을 확인하여 정확한 원인을 파악하고 외부 API 이용시 공식 문서를 반드시 참고할 것
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
