package access.b;

//import access.a.DefaultClass1;
//access.a.DefaultClass1 is not public in access.a; cannot be accessed from outside package
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지의 default 클래스 사용 불가
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();
    }
}
