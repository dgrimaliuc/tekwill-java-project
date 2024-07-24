package AnastasiaGoncear.Lesson5AnastasiaGoncear;

public class Maximum {
    public static void main(String[] args) {

        int result = maxOfThree(10, 2, 15);

    }

    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;

        }
        System.out.println("The maximum value is: " + max);

        return max;
    }
}
