package zabun_mihail;

public class MethodsM {
    public static void main(String[] args) {
        int myLocalValue = maxValue(26, 37);
        System.out.println(myLocalValue);
        newFactorial(18);
        int[] sumOfElements = {15, 20, 25, 30, 35, 40, 45, 50};
        printSum(sumOfElements);
        System.out.println(triangle(3, 4.7, 5.6));
    }

    //1. Write a method that takes two integers as parameters and returns the maximum of the two.
    public static int maxValue(int x, int y) {
        return Math.max(x, y);
    }

    //2. Implement a method that calculates the factorial of a given number.
    // The method should take an integer as a parameter and return the factorial value
    public static void newFactorial(long x) {
        long f = 1;
        for (long i = 1; i <= x; i++)
            f *= i;
        System.out.println("Factorial of " + x + " : " + f);
    }

    //3. Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.

    public static void printSum(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {

            sum = sum + inputArray[i];
        }
        System.out.println(sum);
    }
    public static boolean triangle(double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a))
            return true;
        return false;
    }
}

