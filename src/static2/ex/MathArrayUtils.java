package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // private 접근제한자로 인스턴스 생성을 막는다
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }

}
