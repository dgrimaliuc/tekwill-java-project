package main.java.alexandru_todos;

import java.util.Scanner;

public class ArraysAndLoops {
    public static void main(String[] args) {

        // Homework
        // Loops (while and for)
        // 1. Calculate the sum of numbers 55 to 111 using a do-while loop
        int sum;
        sum = 0;
        int i;
        i = 55;
        do {
            sum += i;
            i++;
        } while (i <= 111);
        System.out.println("Task 1: Sum of numbers from 55 to 111 is: " + sum);

        // 2. Calculate the sum of numbers from 1 to 100 using a for loop.
        for (i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("Task 2: Sum of numbers from 1 to 100 is: " + sum);

        // Arrays
        // 3. Write a program to check if an element exists in an array of integers.
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int myNumber;
        boolean foundNumber = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        myNumber = scanner.nextInt();

        for (int number : numbers){
            if (myNumber == number) {
                foundNumber = true;
                break;
            }
        }
        if (foundNumber) {
            System.out.println("Task 3: There is such number in array");
        } else {
            System.out.println("Task 3: There is no such number in array");
        }

        // 4. Write a program to count the number of positive elements in an array of integers.
        int [] numbers1 = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        int count = 0;
        for (int j = 0; j < numbers1.length; j++){
            if (numbers1[j] >= 0) {
                count++;
            }
        }
        System.out.println("Task 4: Number of positive numbers in this array is: " + count);
    }
}