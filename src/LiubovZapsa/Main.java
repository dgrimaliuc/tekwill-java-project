package LiubovZapsa;

public class Main {
    public static void main(String[] args) {
 /*  Task1 Write a program that counts from 10 to 1
        int count = 10;
        while (count >= 0) {
            System.out.println(count);
            count = count - 1;


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

       // Task2 Write a program that prints the multiplication
            // table for a given number
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);


        // Task3 Write a program that prints the sum of all odd numbers from 1 to 51
        // using a for loop
        int sum = 0;
        for (int i = 1; i <= 51; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all odd numbers from 1 to 51: " + sum);

        // Average some numbers
        double sum = 0;
        int count = 0;
        int input = 0;
        Scanner sc = new Scanner(System.in);
        while (input >= 0) {
            System.out.println("Enter grade: ");
            input = sc.nextInt();
            if (input < 0) {
                break;
            }
            sum += input;
            count++;
        }
        System.out.println("Average grade is: " + sum / count);

        //  an Array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Sum is: " + sum);

        // Max number in an array
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 0; i < arr.length;
             i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max number is: " + max);

        // Is the number in an array
        int[] arr = {1, 2, 3, 4, 5};
        int element = 5;
        boolean exists = false;
        exists = true;
        System.out.println("Number is: " + element);

        // Sum of positive number in an array
        int[] arr = {1, 2, 3, -4, -5};
        int sum = 0;
        for (int number : arr) {
            for (number > 0) {
                sum = sum + number;
            }
        }
        System.out.println("Sum of positive numbers is: " + sum);

        //Homework
        // While
        //Calculate the sum of numbers from 55 to 111 using a do-while loop.
        int sum = 0;
        int count = 55;
        while (count <= 111) {
            sum = sum + count;
            count++;
        }
        System.out.println("The sum of numbers from 55 to 111: " + " " + sum);

// Calculate the sum of numbers from 1 to 100 using a for loop.
        int sum = 0;
        for (int i = 1; i <= 100; i += 1) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to 100: " + " " + sum);
    */
// Arrays
//Create a program that finds and
// displays the average value of all elements in an array
// of floating-point numbers.
        int[] arr = {1.2, 2.9, 3.4, 4.9, 5.9};
        double sum = 0;
        int count = 0;
        for (int i : arr) {
            sum += i;
            count++;
        }
        System.out.println("The average value of all elements in an array of" +
                " floating-point numbers: " + " " + sum / count);
    }
}














