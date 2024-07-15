package SergheiRubailo;

public class Task4 {
    public static void main(String[] args) {

        /*While
        Calculate the sum of numbers from 55 to 111 using a do-while loop. */

        int count = 55;
        int sum = 0;

        do {
            sum = sum + count;
            count++;
        } while (count <= 111);

        System.out.println("Sum: " + sum);

        /*For
        Calculate the sum of numbers from 1 to 100 using a for loop.*/

        int sum2 = 0;

        for (int i = 1; i <= 100; i++) {
            sum2 = sum2 + i;
        }

        System.out.println("Sum2: " + sum2);

        /*Arrays
        Create a program that finds and displays the average value of all elements in an array of floating-point numbers. */

        double[] arr = {1.1, 2.2, 3.56, 4.32, 5.3, -2.3, 0};
        double sum3 = 0;

        for (double number : arr) {
            sum3 = sum3 + number;
        }

        System.out.println("Average: " + sum3 / arr.length);

    }
}
