package anna_gontari;

public class Arrays {
    public static void main(String[] args) {
//Write a program that calculates and prints the sum of all elements in an array of integers
        int[] numbers = {1, 2, 9, 38, -20, 16, 3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);

        //Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
        int[] numbers2 = new int[]{11, 38, 2, 64, -50, 28, -15};
        int sum2 = 0;
        for (int a = 0; a < numbers2.length; a++)
            sum2 = sum2 + numbers2[a];
        double average = sum2 / numbers2.length;
        System.out.println("Average value of the array elements is : " + average);

        //Find max value in an array with numbers
        long[] numbers3 = new long[10];
        for (int b = 0; b < numbers3.length; b++) {
            numbers3[b] = Math.round(Math.random() * 10);
        }
        for (int b = 0; b < numbers3.length; b++) {
            System.out.print(numbers3[b] + " ");
        }
        long max = numbers3[0];
        for (int b = 0; b < numbers3.length; b++) {
            if (numbers3[b] > max) {
                max = numbers3[b];
            }
        }
        System.out.println("max=" +max);
    }
}
