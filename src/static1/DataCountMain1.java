package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data = new Data1("A");
        System.out.println("data.count = " + data.count);

        Data1 data2 = new Data1("B");
        System.out.println("data.count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("data.count = " + data3.count);
    }
}
