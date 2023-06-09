package alexandr_samohvalov;

import java.util.Scanner;

public class ConditionsMain {
    // Check if a number is positive, negative, or zero.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a < 0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is equal to zero");
        }
    }
}

