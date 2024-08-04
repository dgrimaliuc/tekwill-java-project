package LiubovZapsa.Lesson1707;

public class Homework2 {
    public static int sumIntegers(Integer... numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sumIntegers(1, 3, 5, 7, 9);
        System.out.println("Sum: " + sum);
    }
}

