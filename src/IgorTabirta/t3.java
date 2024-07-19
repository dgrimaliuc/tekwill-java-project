package IgorTabirta;

public class t3 {
    public static void main(String[] args) {
        // Write a program that counts from 10 to 1 using a while loop.
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        // Write a program that prints the sum of all even numbers
        // from 0 to 50 using a while loop.
        int count1 = 0;
        int sum = 0;
        while (count1 <= 50) {
            sum += count1;
            count1 += 2;
        }
        System.out.println("Sum of even numbers from 0 to 50: " + sum);

        // Calculate the sum of numbers from 55 to 111 using a do-while loop.
        int count2 = 55;
        int sum1 = 0;
        while (count2 <= 111) {
            sum1 += count2;
            count2++;
        }
        System.out.println("Sum of numbers from 55 to 111: " + sum1);

        // Calculate the sum of numbers from 1 to 100 using a for loop.
        int sum2 = 0;
        for (int i = 1; i <= 111; i++) {
            sum2 += i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum2);

        // Create a program that finds and displays the average value
        // of all elements in an array of floating-point numbers.

        double[] arr = {8.45, 5.65, 19.32, 48.25, 4.64};
        double sum3 = 0;
        for (double number : arr) {

            sum3 += number;
        }
        double avg = sum3 / arr.length;
        System.out.println((double) avg);
    }
}

