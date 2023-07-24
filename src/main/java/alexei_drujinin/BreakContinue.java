package alexei_drujinin;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        numberWithExcept();
        breakWhenNumberNegative();
    }

    public static void breakWhenNumberNegative() {
        System.out.println("Insert your number, if number will be negative, insert will be stoped");

        int i;
        Scanner scanner;
        do {
            System.out.println("Insert number");
            scanner = new Scanner(System.in);
            i = scanner.nextInt();
            if (i < 0) {
                System.out.println("your number is negative, insert stoped");
                break;
            }
        }
        while (true);
    }

    public static void numberWithExcept() {
        System.out.println("Print number from 1 to 10 without 3 and 7 ");
        for (int i = 0; i <= 10; i++) {
            if (i == 3 || i == 7)
                continue;
            System.out.println(i + " ");
        }
    }
}
