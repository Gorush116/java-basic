package ref;

public class VarChange1 {

    public static void main(String[] args) {

        int a = 10;
        int b = a; // a의 값을 복사해서 대입 => 10을 복사해서 대입 => b = 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
