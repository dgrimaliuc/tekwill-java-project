package Leas_Liudmila;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        sumArray();
        averageArray();
        maxValue();
        intSorting();
        intSorting2();
    }

    //1. Write a program that calculates and prints the sum of all elements in an array of integers.
    public static void sumArray() {
        int[] num = {23, 43, 12, 66, 22};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }

    //2.  Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
    public static void averageArray() {
        float[] num = {23, 43, 12, 66, 22};
        float sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("The average value of all elements in the array: " + sum / num.length);
    }

    //3. Find max value in an array with numbers
    public static void maxValue() {
        int[] num = {23, 43, 12, 66, 22};
        int maxNumber = Integer.MIN_VALUE;
        int newMaxNumber = Integer.MIN_VALUE;
        for (int i : num) {
            if (i > maxNumber) {
                maxNumber = i;
            }
            for (int a : num) {
                if (a > newMaxNumber && a < maxNumber) {
                    newMaxNumber = a;
                }
            }
        }
        System.out.println(maxNumber);
        System.out.println(newMaxNumber);

    }

    //4. Sort an integer array with any algorithm of sorting
    public static void intSorting() {
        int[] num = {-23, 43, 12, -66, 22};
        Arrays.sort(num);
        for (int n : num) {
            System.out.print(n + " ");
        }
    }

    public static void intSorting2() {
        int[] numbers = {-23, 43, 12, -66, 22};
        ArraysMain.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] num) {
        var stepsCount = num.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (var i = 0; i < stepsCount; i++) {
                if (num[i] > num[i + 1]) {
                    var temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
    }
}



