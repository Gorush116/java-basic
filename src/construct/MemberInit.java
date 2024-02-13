package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        // 변수명이 동일할 때 매개변수가 우선순위가 더 높음
        // -> 필드값에 값을 대입시킬 때 this 사용 
        // this : 자기 자신의 인스턴스 참조값
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
