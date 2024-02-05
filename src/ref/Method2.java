package ref;

public class Method2 {

    public static void main(String[] args) {
        Student stu1 = createStudent("학생1", 15, 90);
        System.out.println("stu1 = " + stu1);

        Student stu2 = createStudent("학생2", 16, 80);
        System.out.println("stu2 = " + stu2);

        printStudent(stu1);
        printStudent(stu2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student = " + student);
        Student.name = name;
        Student.age = age;
        Student.grade = grade;

        return student;
    }
    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
    }

}
