package IngaTitchiev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //While
       // Calculate the sum of numbers from 55 to 111 using a do-while loop.
        int count = 55;
        int sum1 = 0;
        do {
            sum1 += count;
            count++;
        } while (count <= 111);
             System.out.println("Sum 1 is: " + sum1);
        //       For
        //Calculate the sum of numbers from 1 to 100 using a for loop.
        int sum2 = 0;
        for (int i = 0; i < 100; i++) {
            sum2 += count;
                    }
        System.out.println("Sum 2 is: " + sum2);
          //      Arrays
        //Create a program that finds and displays the average value of all elements
        // in an array of floating-point numbers.
        float[] arr = new float[]{1.7F, 2f, 3f, 4.8f, 5f, 6f, 7f, 8.4f, 5f, 6f, 7.3f, 8f};
        float avg = 0;
        float sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg=sum/arr.length;
        System.out.println("The average value is: " + avg);

    }
}
