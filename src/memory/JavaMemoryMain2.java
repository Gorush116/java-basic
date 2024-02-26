package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        // 지역변수는 stack, 인스턴스는 heap 영역 관리
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        System.out.println("data1 memory= " + data1);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data2 memory= " + data2); // data1 과 같은 인스턴스를 참조
        System.out.println("data2 = " + data2.getValue());
        System.out.println("method2 end");
    }
}
