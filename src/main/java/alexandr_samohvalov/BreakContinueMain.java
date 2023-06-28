package alexandr_samohvalov;

import java.util.Scanner;

public class BreakContinueMain {
    //Create a program, which will ask user to enter a number, if number will be negative exit the loop
    public static void negativeNumExit(String[] negativeNumExit) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Fill in a number");
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }

    // Create a program which will print all number from 1 to 10 except 3 and 7 using continue keyword
    public static void allNumExp1and10(String[] allNumExp1and10) {
        for (int i = 0; i <= 10; i++) {
            if (i == 3) {
                continue;
            } else if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
