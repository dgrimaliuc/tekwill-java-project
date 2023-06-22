package serghei_condrasov;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        // 1. Create a program, which will ask user to enter a number, if number will be negative exit the loop.
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your number :");
            int n = scan.nextInt();
            if (n < 0) {
                break;
            }
        }

        // 2. Create a program which will print all number from 1 to 10 except 3 and 7 using continue keyword.
        for (int i = 1; i <= 10; i++) {
            if ((i == 3) || (i == 7))  {
                continue;
            }
            System.out.println(i + " ");
            }
        }
    }
