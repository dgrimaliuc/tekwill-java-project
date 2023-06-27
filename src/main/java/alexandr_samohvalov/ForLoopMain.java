package alexandr_samohvalov;

public class ForLoopMain {
    // Print numbers from 1 to 10 using a for loop
    public static void printNumFrom1To10(String[] printNumFrom1To10) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // Calculate the sum of numbers from 1 to 100 using a for loop.
    public static void calSumOfNum(String[] calSumOfNum) {
        int sum = 0;
        int i = 0;
        for (i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    // Calculate the factorial of a given number using a for loop.
    public static void calFactorialOfNum(String[] args) {
        int factorial = 1;
        int i = 0;
        for (i = 1; i <= 3; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}