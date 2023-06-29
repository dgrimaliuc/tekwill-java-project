package tofan_dmitrii;

//Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.
public class MethodArray {
       public static void main(String[] args) {
        System.out.println("Sum = " + sumOf());
    }

    public static int sumOf(int... integers) {
        int[] numbers = {3, 8, 1, 451, 69, -23, 25};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }
}

