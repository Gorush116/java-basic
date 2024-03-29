package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        System.out.println(a);
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        System.out.println(b);
        b.methodB();
        b.methodCommon();
    }
}
