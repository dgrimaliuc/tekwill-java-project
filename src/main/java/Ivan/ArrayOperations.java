package Ivan;

public class ArrayOperations {
    public static void main(String[] args) {
        // Task 1: Calculate and print the sum of all elements in an array of integers
        int[] integers = {2, 4, 6, 8, 10};
        int sum = calculateSum(integers);
        System.out.println("Sum of integers: " + sum);

        // Task 2: Find and display the average value of all elements in an array of floating-point numbers
        double[] floats = {1.5, 2.5, 3.5, 4.5, 5.5};
        double average = calculateAverage(floats);
        System.out.println("Average of floats: " + average);

        // Task 3: Find the max value in an array of numbers
        int[] numbers = {9, 3, 7, 5, 1};
        int max = findMax(numbers);
        System.out.println("Max value: " + max);

        // Task 4: Find the second max element in an array
        int[] elements = {12, 8, 16, 5, 10};
        int secondMax = findSecondMax(elements);
        System.out.println("Second max element: " + secondMax);
    }

    // Task 1: Calculate the sum of all elements in an array of integers
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Task 2: Calculate the average value of all elements in an array of floating-point numbers
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Task 3: Find the maximum value in an array of numbers
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Task 4: Find the second maximum element in an array
    public static int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}


