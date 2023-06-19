package anna_gontari;

public class MethodArraysSum {
    //Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.
    public static void main(String[] args) {
        System.out.println("Sum = " + sumOf());
    }

    public static int sumOf(int... integers) {
        int[] numbers = {1, 2, 9, 38, -20, 16, 3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }
}
