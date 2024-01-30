package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student();   // 인스턴스화(객체를 메모리에 할당하여 사용할 수 있는 상태)
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 85;

//        Student[] students = new Student[] {student1, student2};
        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + ", 나이 : " + students[i].age + ", 성적 : " + students[i].grade);
        }

        for ( Student student : students ) {
            System.out.println(student.toString());
        }

    }
}
