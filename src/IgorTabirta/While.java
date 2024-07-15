package IgorTabirta;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        // Write a program that counts from 1 to 10 using a while loop.
        int count = 1;
        while (count <= 15) {
            System.out.println(count);
            count++;
        }

// Write a program that prints all even numbers from 0 to 50 using a while loop.

        int count1 = 0;
        while (count1 <= 50) {
            System.out.println(count1);
            count1 += 2; // count = count + 2;
        }

        // Implement a program that prompts the user to enter a password until the correct password entered.
        String password = "1111";
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals((password))) {
            System.out.println("Enter password: ");
            input = sc.nextLine();
        }
        System.out.println("Correct password!");

        //  Create a program that calculates the sum of all even numbers between 1 and 100 using a while loop.
        int count3 = 0;
        int sum = 0;

        while (count3 <= 10) {
            sum = sum + count3;
            count3 += 2;
        }

        System.out.println("Sum of all even numbers between 1 and 100 is: " + sum);

        System.out.println("Sum of all even numbers between 1 and 100 is: " + sum);
    }
}
