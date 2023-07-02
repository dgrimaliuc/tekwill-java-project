package Serghei_Stoianov;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i;

////Create a program, which will ask user to enter a number, if number will be negative exit the loop
        Scanner scanner = new Scanner(System.in);
        for (i = 1; i > 0; i++) {
            System.out.println("enter a number");
            int sc = scanner.nextInt();
            if (sc < 0) break;
        }


//Create a program which will print all number from 1 to 10 except 3 and 7 using continue keyword
        for (i = 1; i <= 10; i++) {
            if (i == 3 || i == 7)
                continue;
            System.out.print(i + " ");

        }

    }
}
