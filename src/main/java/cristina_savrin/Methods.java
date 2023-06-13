package cristina_savrin;

public class Methods {

    public static void main(String[] args) {

        System.out.println("The maximum value of 18 and 85: " + findMax(18, 85));
        System.out.println("Factorial of number 15: " + factorial(15));

        int[] arr = {56, 11, 34, 5, 78, 32, 47};
        System.out.println("The sum of elements in array: " + sumArray(arr));

        System.out.println("Is triangle with sides 5,6,7 valid? " + validTriangle(5, 6, 7));
    }

    // 1. Write a method that takes two integers as parameters and returns the maximum of the two.
    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

    // 2. Implement a method that calculates the factorial of a given number. The method should take an integer as a parameter and return the factorial value.
    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // 3. Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    // 4. (Optional hard task) write a method which will accept 3 parameters -> sides of a triangle and will return Boolean value if this triangle can exist or not.
    public static boolean validTriangle(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a))
            return true;
        return false;
    }
}
