package serghei_condrasov;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Maximum of the two" + " - " + maxOfTwoNumbers(3, 2));
        System.out.println("The factorial value" + " - " + getFactorial(6));
    }

    // 1. Write a method that takes two integers as parameters and returns the maximum of the two.

    public static int maxOfTwoNumbers(int a, int b) {
        return Math.max(a, b);
    }

    /*2. Implement a method that calculates the factorial of a given number.
         The method should take an integer as a parameter and return the factorial value.*/
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    /*3. Write a method that takes an array of integers as a parameter
    and returns the sum of all the elements in the array.*/
    public static void testArray() {
        int myArray[] = {3, 5, 7, 12};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }
}
