package CristevaEcaterina;

public class homework2 {
    public static void main(String[] args) {

        // 1. Calculate the sum of numbers from 55 to 111 using a do-while loop.//
       /*

       int count = 55;
       int sum = 0;

        while (count <= 111) {
            sum = sum + count;
            count++;
        }
        System.out.println("The sum of all numbers from 55 to 111 is: " + sum);

        // 2.Calculate the sum of numbers from 1 to 100 using a for loop.

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+= i;
            System.out.println("The sum of numbers from 1 to 100 is: " + sum);
        }*/


        // 3. Create a program that finds and displays the average value of all elements in an array of floating-point numbers.//
        double[] num = {10.5, 20.7, 30.2, 40.3, 50.4, 60.1};

        double sum = 0;
        for (double number : num) {
            sum += number;
        }
        double average = sum / num.length;
        System.out.println("The average value of the array elements is: " + average);
    }
}
