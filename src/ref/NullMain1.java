package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data);

        data = null;
        System.out.println("3. data = " + data);
        // 아무도 참조하지 않는 인스턴스의 최후
        // Java에서는 아무도 참조하지 않는 인스턴스를 JVM의 GC가 더 이상 사용하지 않는 인스턴스라고 판단 후 자동으로 인스턴스를 메모리에서 제거
    }
}
