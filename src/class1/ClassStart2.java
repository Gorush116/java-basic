package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {70, 80};

        for(int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrades[i]);
        }
        
        // 배열 또한 하나의 학생정보를 추가하려면 배열 3개에 각각의 요소를 추가해야 함 / 제거 또한 각각의 요소에 대해서 행해야 함
    }

}
