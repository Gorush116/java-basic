package ref;

public class MethodChange2 {

    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("a = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeReference(dataA);
        System.out.println("a = " + dataA.value);
        // 업무 파악은 머릿 속으로 큰 그림을 먼저 그리고 프로세스를 파악한 뒤 디테일을 챙긴다
        // 에러 발생시 여러 부분을 확인하여 정확한 원인을 파악하고 외부 API 이용시 공식 문서를 반드시 참고할 것
    }

    static void changeReference(Data dataX) { 
        // 매개변수 dataX에 dataA의 값(참조값)을 전달
        // dataX와 dataA는 같은 참조값을 가진다 -> dataX를 통해서도 같은 참조값의 Data 인스턴스 접근 가능
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
        /**
         * 자바에서 매서드의 매개변수는 항상 값에 의해 전달되지만, 그 값이 기본형이냐 참조형이냐에 따라 동작이 달라진다.
         * 기본형 : 값이 복사되어 전달 -> 메서드 내부에서 값을 변경해도 호출자의 변수에는 영향 없음
         * 참조형 : 참조값이 복사되어 전달 -> 내부에서 파라미터로 전달된 객체의 멤버 변수 변경시, 호출자의 객체 내용도 변경됨
         */
    }
}
