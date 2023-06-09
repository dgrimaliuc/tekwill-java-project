package dmitrii_tofan._HW_3;

import java.util.Scanner;

public class For_main {
    public static void main(String[] args) {
// 1. Print numbers from 1 to 10 using a for loop (using foreach loop)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------");
// 2.Calculate the sum of numbers from 1 to 100 using a for loop
        int sum = 0;
        for (int a = 0; a <= 100; a++) {
            sum += a;
        }
            System.out.println("Сумма чисел от 1 до 100 = " + sum);
        System.out.println("-------------------------------------------");
// 3.Calculate the factorial of a given number using a for loop.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = scanner.nextInt();
              int fac = 1;
              int sum1 = 0;
        for (int i = 1; i <= num; i++) {
            fac *= i;
            sum1 += fac;
        }
        System.out.println("Summ of fac number " + num + " is: " + fac);

        }
    }

