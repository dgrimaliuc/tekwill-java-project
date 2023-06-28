package alexandr_samohvalov;

public class MethodsMain {

    //Write a method that takes two integers as parameters and returns the maximum of the two.
    public static int maxInteger(int a, int b) {
        return Math.max(a, b);
    }

    public static void maximumOfTwo(String[] maximumOfTwo) {
        int max = maxInteger(5, 8);
        System.out.print(max);
    }

    // Implement a method that calculates the factorial of a given number. The method should take an integer as a parameter and return the factorial value.
    public static int calFactorialOfNum(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void factorial(String[] args) {
        int factorial = calFactorialOfNum(5);
        System.out.print(factorial);
    }

    //Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.

    public static int arrays(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    ;

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 57};
        int sum = arrays(numbers);
        System.out.print(sum);

    }
}
