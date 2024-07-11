package PotoracMihai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        int number = 11;

        if(number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        int num = 6;
         if(num % 2 == 0 && num % 3 == 0) {
            System.out.println("Number is divisible by 2 and 3");
         } else {
            System.out.println("Number is not divisible by 2 and 3");
         }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!" + "Length of your name is: " + name.length());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for x: ");
        int x = scanner.nextInt();
        System.out.println("Enter a number for y: ");
        double y =  scanner.nextDouble();
        System.out.println("Sum of x and y is: " + (x + y));

        if(x == y){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }

        if(x >  0){
            System.out.println("Number  'x' is positive");
        } else if(x < 0){
            System.out.println("Number 'x' is negative");
        } else {
            System.out.println("Number 'x' is zero");
        }

        int a = 3 ,b = 2, c = 10;
        if(a > b && a > c){
            System.out.println("a is the largest number");
        } else if(b > a && b > c){
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firstName: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your lastName: ");
        String lastName = sc.nextLine();
        System.out.println("Hello " + firstName + " " + lastName + "!");


        int number = 0;
        switch (number){
            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("Number is not 0, 1 or 2");
        }*/


        //task 2
        // 1. Создайте две переменные и найдите их сумму (+), разность (-), произведение (*) и частное (/) и выведете каждый результат на экран
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a number for number2: ");
        int number2 = scanner.nextInt();
        System.out.println("Sum of number1 and number2 is: " + (number1 + number2));
        System.out.println("Difference of number1 and number2 is: " + (number1 - number2));
        System.out.println("Product of number1 and number2 is: " + (number1 * number2));
        System.out.println("Quotient of number1 and number2 is: " + (number1 / number2));

        // 2. Выведите на экран наименьшее из двух чисел
        if (number1 < number2) {
            System.out.println("Number1 is the smallest number");
        } else {
            System.out.println("Number2 is the smallest number");
        }

        // 3.С помощью Scanner попросите пользователя ввести свой возраст, если число больше либо равно 18 выведите “Вы совершеннолетний” иначе “Вы не совершеннолетний”
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Вы совершеннолетний!");
        } else {
            System.out.println("Вы не совершеннолетний!");
        }
    }
}