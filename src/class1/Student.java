package class1;

public class Student {

    // 학생에 대한 정보를 담는 클래스를 작성
    // 클래스 => 객체를 기술하기 위한 문법

    // 클래스(설계도)를 사용해서 실제 메모리에 만들어진 실체(객체, 인스턴스) 생성 ==> 객체화
    // 객체는 추상적일 수 있음, 인스턴스는 객체 안에 포함되는 개념(실체화)

    // 멤버변수(Member Variable) == 필드(Field) 선언 시작
    // 멤버변수(Member Variable) : 특정 클래스에 소속된 변수
    // 필드(Field) : 데이터 항목을 가르키는 전통적인 용어
    String name;
    int age;
    int grade;
    // 멤버변수(Member Variable) == 필드(Field) 선언 끝


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
