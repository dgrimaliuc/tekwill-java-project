package alina_gutsul;

public class Methods {
    //Write a method that takes two integers as parameters and returns the maximum of the two.
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    //Implement a method that calculates the factorial of a given number.
    //The method should take an integer as a parameter and return the factorial value.
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    //Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    //(Optional hard task) write a method which will accept 3 parameters -> sides of a triangle and will return
    // Boolean value if this triangle can exist or not.
    // Example 1, 13, 100 -> false (such triangle cannot exists)
    // 3, 4.7, 5.6 -> true (this triangle can be created)
    public static boolean isTriangleExists(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }

    public static void main(String[] args) {
        int max = findMax(5, 8);
        System.out.println("Maximum: " + max);

        int factorialValue = factorial(5);
        System.out.println("Factorial: " + factorialValue);

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        System.out.println("Sum: " + sum);

        boolean triangleExists = isTriangleExists(1, 13, 100);
        System.out.println("Triangle exists? " + triangleExists);
    }
}
