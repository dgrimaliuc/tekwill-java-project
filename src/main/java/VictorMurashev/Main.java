package VictorMurashev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //12-07-2024

        //Homework as of 12-07-2024

        //Task 1 - Calculate the sum of numbers from 55 to 111 using a do-while loop.
        int sum_while = 0;
        int i = 55;

        while (i <= 111) {
            sum_while += i;
            i++;
        }
        System.out.println("Sum of numbers from 55 to 111 is " + sum_while);

        //Task 2 - Calculate the sum of numbers from 1 to 100 using a for loop.
        int sum_for = 0;
        for (i = 1; i <= 100; i++) {
            sum_for += i;
        }
        System.out.println("Sum of numbers from 1 to 100 is " + sum_for);

        //Task 3 - Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
        float sum_arr = 0;
        float[] array = {12, 13, 14, 15, 16, 17, 18, 19};

        for (float calc_avg : array) {
            sum_arr += calc_avg;
        }

        System.out.println("Avarage value of the array elements is " + sum_arr / array.length);

        //Lesson part as of 12-07-2024

        //While loop

        /*int count = 10;
        while (count >= 1) {
            //sum+=count;
            System.out.println("Count = " + count);
            count--;

        }

        int count2 = 0;
        int sum = 0;
        while (count2 <= 50) {
            sum += count2;
            count2 += 2;
        }
        System.out.println("Sum from 0 to 50 is " + sum);

        //For loop
        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }

        int sum_for = 0;
        for (int i = 0; i <= 51; i += 2) {
            sum_for += i;

        }
        System.out.println("Sum from 0 to 50 is " + sum_for);

        //Arrays

        int[] arr = {1, 2, 4, 5, 6, -1, -9};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number");
        int number = Integer.parseInt(scanner.nextLine());

        int sum_arr = 0;
        boolean presents = false;
        for (int i : arr) {
            if (i == number) {
                presents = true;
            }
            if (i > 0) {
                sum_arr += i;
            }
        }
        if (presents == true) {
            System.out.println("Element " + number + " presents in the array");
        } else {
            System.out.println("Element " + number + " does not exist in the array");
        }
        System.out.println("Sum of elements of the array " + sum_arr);*/




        /*int a=2; int b=3;
        int c = a + b;
        System.out.println("Sum of the a + b = " + c);

        int a = 7;
        int b = 6;
        int c = 5;
        /*if (a == b) {
            System.out.println("Number a equal to b");

        } else {
            System.out.println("Number a is not equal to b");
        }

        if (a > 0){
            System.out.println("Number a is positive");
        }
        else if (a<0) {
            System.out.println("Number a is negative");
        }
        else {
            System.out.println("Number a equal to 0");
        }

        if (a > b && a > c)
            System.out.println("Number a = " + a + " is maximum");
        else if (b > a && b > c)
            System.out.println("Number b = " + b + " is maximum");
        else {
            System.out.println("Number c = " + c + " is maximum");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First Name");
        String firstName = scanner.nextLine();
        System.out.println("Input Last Name");
        String lastName = scanner.nextLine();

        System.out.println("Your first name is: " + firstName + "; Your last name is: " + lastName);

        // Homework Task 2

        int var1 = 10; int var2 = 5;

        System.out.println("Sum of var1 and var2 is " + (var1 + var2));
        System.out.println("Difference of var1 and var2 is " + (var1 - var2));
        System.out.println("Composition of var1 and var2 is " + (var1 * var2));
        System.out.println("Quotient  of var1 and var2 is " + (var1 / var2));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Your age");
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 18) {
            System.out.println("You are minor");
        } else {
            System.out.println("You are adult");
        }*/



    }


}
