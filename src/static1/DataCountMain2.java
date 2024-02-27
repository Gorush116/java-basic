package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        // Heap 영역에서 참조를 통한 count 증가
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A counter.count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B counter.count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C counter.count = " + counter.count);
    }
}
