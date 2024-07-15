package main.java.TatianaJeleascov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First Number");
        int numOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Second Number");
        int numTwo = Integer.parseInt(scanner.nextLine());

        calculator(numOne, numTwo);

        System.out.println("The smallest number is: " + numberLow(numOne, numTwo));

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(ageIdentifier(age));
        
        doWhileCycle();
        forCycle();
        arraysAvg();
    }

    private static void calculator(int numOne, int numTwo) {
        int temp = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + temp);
        temp = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + temp);
        temp = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + temp);
        temp = numOne / numTwo;
        System.out.println(numOne + " / " + numTwo + " = " + temp);
    }

    private static int numberLow(int numOne, int numTwo) {
        return Math.min(numOne, numTwo);
    }

    private static String ageIdentifier(int age) {
        return (age > 18) ? "Вы совершеннолетний" : "Вы не совершеннолетний";
    }
    
    private static void doWhileCycle()  {
        int temp = 0;
        int i = 55;
        do {
            temp += i;
            i++;
        } while (i <= 111);
        System.out.println("Task 1 is: " + temp);
    }
    
    public static void forCycle() {
        int temp = 0;
        for(int i=1; i<=100; i++) {
            temp+=i;
        }
        System.out.println("Task 2 is: " + temp);
    }
    
    
    public static void arraysAvg() {
    double[] arr = {1, 2, 3, 4, 5}; 
    double temp = 0;
    
    for (int i = 0; i < arr.length; i++) { 
        temp += arr[i];
    }
    
    System.out.println("Task 3 is: " + (temp / arr.length)); 
    }
}
