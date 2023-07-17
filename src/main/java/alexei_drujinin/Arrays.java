package alexei_drujinin;

import java.util.Scanner;

public class Arrays {

    static Scanner scanner;

    static int[] numbers = new int[4];

    static int sum;

    static int temp;

    public static void main(String[] args) {
        insertDigitsInArray();
        printTheSum();
        getAvgValue();
        getMaxValue();
        getSecondMaxElement();
        sortArray();
    }

    public static void insertDigitsInArray() {
        scanner = new Scanner(System.in);
        System.out.println("Insert 4 numbers in array");
        int n = 4;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    //1.Write a program that calculates and prints the sum of all elements in an array of integers.
    public static void printTheSum() {
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of your numbers is " + sum);
    }

    //2.Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
    public static void getAvgValue() {
        double avg = (double) sum / numbers.length;
        System.out.println("The average value of your numbers is " + avg);
    }

    //3.Find max value in an array with numbers
    public static void getMaxValue() {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max value from your numbers is " + max);
    }

    //4.( Optional hard task ) find second max element
    public static void getSecondMaxElement() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("The second max element in array is " + numbers[numbers.length - 2]);
    }

    //5.(Optional hard task ) sort an integer array with any algorithm of sorting
    public static void sortArray() {
        System.out.println("Sorted array looked the ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(numbers[i]);
        }
    }
}

