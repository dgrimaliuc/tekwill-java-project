package zabun_mihail;

public class ArraysM {
    public static void main(String[] args) {
        sumOfElements();
        average();
        maxValue();
    }

    // 1. Write a program that calculates and prints the sum of all elements in an array of integers.
    public static void sumOfElements() {
        int[] a = {10, 75, 36, 61, 83, 100, 15, 33, 23, 80};
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("The sum of all elements in array: " + sum);
    }

    //2.  Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
    public static void average() {
        float[] num = {23, 43, 12, 66, 22};
        float sum = 0;
        for (float i : num) {
            sum += i;
        }
        System.out.println("The average value of all elements in the array: " + sum / num.length);
    }

    //3. Find max value in an array with numbers
    public static void maxValue() {
        int[] a = {52, 32, 250, 60, 30, 502, 8, 93, 503, 178};
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The max value in array: " + max);
    }
}
