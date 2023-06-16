package Serghei_Stoianov;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
//Print numbers from 1 to 10 using a for loop
        int i;
        for (i = 0; i++ < 10; )
            System.out.print(i + " ");

// Calculate the sum of numbers from 1 to 100 using a for loop.
        System.out.println();
        int sum = 0;
        for (i = 0; i++ < 100; )
            sum += i;
        System.out.println(sum);

//Calculate the factorial of a given number using a for loop.
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        int f = 1;
        for (i = 0; i++ < sc; )
            f *= i;
        System.out.println("factorial of a " + sc + " is " + f);

//Print all numbers from 20 to 0 with step 2 ( 20, 18, 16, 14)
        for (i = 21; i-- > 0; )
            System.out.print(i-- + " ");


    }
}
