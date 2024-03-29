package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;           // 학생을 담아둘 수 있는 변수 선언
        student1 = new Student();   // 인스턴스화(객체를 메모리에 할당하여 사용할 수 있는 상태)
        student1.name = "학생1";
        /**
         * 1. Student1의 메모리 참조값을 통해 접근
         * 2. name 접근
         * 3. name 변수에 대입
         */
        student1.age = 18;
        student1.grade = 80;
        // 클래스@메모리참조값(16진수)
        System.out.println(student1.toString());

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 85;
        System.out.println(student2.toString());

    }
}
