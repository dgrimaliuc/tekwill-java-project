package Ivan;

public class Methods {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;

        // Task 1: Find the maximum of two integers
        int max = findMax(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);

        int factorialNum = 6;

        // Task 2: Calculate the factorial of a given number
        int factorial = calculateFactorial(factorialNum);
        System.out.println("Factorial of " + factorialNum + " is: " + factorial);

        int[] array = {2, 4, 6, 8, 10};

        // Task 3: Calculate the sum of all elements in an array
        int sum = calculateSum(array);
        System.out.println("Sum of array elements: " + sum);
    }

    // Task 1: Find the maximum of two integers
    public static int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    // Task 2: Calculate the factorial of a given number
    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Task 3: Calculate the sum of all elements in an array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
