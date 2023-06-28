package alexandr_samohvalov;

import java.util.Random;

public class NumbersMain {
    //Find the square root of a number
    public static void square(String[] SquareRoot) {
        int a = 49;
        System.out.println(Math.sqrt(a));
    }

    // Generate a random number between 0 and 100.
    public static void main(String[] GenerateRanNum1) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        System.out.println(randomNumber);
    }


    // Generate a random number between 10 and 100.
    public static void generateRanNum2(String[] GenerateRanNum2) {
        Random random = new Random();
        int randomNumber = random.nextInt(91) + 10;

        System.out.println(randomNumber);
    }

    // Calculate the average of three numbers.
    public static void calculateAverageNum(String[] CalculateAverageNum) {
        int a = 3;
        int b = 6;
        int c = 9;
        int sum = a + b + c;
        int average = sum / 3;

        System.out.println(average);
    }

    // Find the maximum of 4 numbers.
    public static void findMaxNum(String[] FindMaxNum) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = -1;
        int max = Math.max(Math.max(Math.max(a, b), c), d);
        System.out.println(("The biggest number is:" + max));
    }
}