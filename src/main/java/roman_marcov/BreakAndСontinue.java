package roman_marcov;

import java.util.Scanner;

public class BreakAndСontinue {
    public static void main(String[] args) {
        userEnterNumber();
        exeptNumbers();

    }

    //  #1 Create a program, which will ask user to enter a number, if number will be negative exit the loop
    public static void userEnterNumber() {
        System.out.println("\n             Break and continue");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n;
        while (true) {
            n = scan.nextInt();
            System.out.print("Enter a number: ");
            if (n < 0) {
                break;
            }
        }
        System.out.println(n);

    }


    //  #2  Create a program which will print all number from 1 to 10 except 3 and 7 using continue keyword
    public static void exeptNumbers() {
        System.out.println("Number except 3and 7");
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            System.out.print(" " + i);
        }
    }
}
