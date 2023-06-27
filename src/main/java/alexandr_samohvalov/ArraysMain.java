package alexandr_samohvalov;

public class ArraysMain {
    //Write a program that calculates and prints the sum of all elements in an array of integers.
    public static void printSumAllElements(String[] printSumAllElements) {
        int[] myArray = {1, 5, 10, 25};
        int sum = 0;
        int i;

        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        System.out.println("The sum is: " + sum);
    }

    // Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
    public static void disAverageValue(String[] disAverageValue) {
        double[] myArray = {1.21, 5.42, 120.2314, 25.2142};
        double sum = 0.0;
        double average = 0.0;
        int i;

        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            average = sum / 4;
        }
        System.out.println("Average numbers = " + average);
    }

    // Find max value in an array with numbers
    public static void maxValue(String[] maxValue) {
        int[] myArray = {1, 5, 10, 25};
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("The Max value is: " + max);

    }
}


