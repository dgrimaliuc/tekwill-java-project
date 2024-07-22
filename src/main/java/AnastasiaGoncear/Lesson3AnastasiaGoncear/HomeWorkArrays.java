package AnastasiaGoncear.Lesson3AnastasiaGoncear;

public class HomeWorkArrays {
    public static void main(String[] args) {
        double[] numbers = {10.5, 20.0, 30.25, 40.75, 50.5};

        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;

        System.out.println("The average value is: " + average);
    }
}

