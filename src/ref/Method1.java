package ref;

public class Method1 {

    public static void main(String[] args) {
        Student stu1 = createStudent("학생1", 15, 90);
//        Student stu1 = new Student(); // 자료형 위치 보고 선언할 것
//        initStudent(stu1,"학생1", 15, 90);
//        stu1.name = "학생1";
//        stu1.age = 15;
//        stu1.grade = 90;

        Student stu2 = createStudent("학생2", 16, 80);
//        Student stu2 = new Student(); // 자료형 위치 보고 선언할 것
//        initStudent(stu2,"학생2", 16, 80);
//        stu2.name = "학생2";
//        stu2.age = 16;
//        stu2.grade = 80;

        printStudent(stu1);
        printStudent(stu2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        Student.name = name;
        Student.age = age;
        Student.grade = grade;

        return student;
    }

//    static void initStudent(Student student, String name, int age, int grade) {
//        student.name = name;
//        student.age = age;
//        student.grade = grade;
//    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
    }

}
