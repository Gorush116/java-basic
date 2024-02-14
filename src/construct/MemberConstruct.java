package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        // 1. 메모리 할당 후
        // 2. 생성자 호출
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age) { // overLoading
        // this()는 생성자 코드의 첫 줄에만 작성할 수 있음
        this(name, age, 50); // this 를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있음
    }
}
