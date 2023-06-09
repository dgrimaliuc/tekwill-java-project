package SimpleJavaProject.src.main.java.Leas_Liudmila;

public class methodsMain {
    public static void main(String[] args) {
        System.out.println(maxValue(34, 85));
        newFactorial(16);
        int[] sumOfElements = {10, 20, 30, 40, 50, 60, 70, 80};
        printSum(sumOfElements);
        System.out.println(triangle(4, 6, 3));
    }

    //1. Write a method that takes two integers as parameters and returns the maximum of the two.
    public static int maxValue(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
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

    //4. ( Optional hard task )
    // write a method which will accept 3 parameters -> sides of a triangle and will return Boolean value if this triangle can exist or not.

    public static boolean triangle(int x, int y, int z) {
        return x + y > z && x + z > y && y + z > x;
    }
}


