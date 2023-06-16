package ana_raetcaia;

import java.util.Scanner;

public class IfElseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Numbr is positive");
            if (num>90){
                System.out.println("A");
            }
            if (num>80){
                System.out.println("B");
            }
            if (num>70){
                System.out.println("C");
            } else {
                System.out.println("D");
            }

            if ((num % 2) == 0 && (num % 3) == 0) {
                System.out.println("Number is divisible by both 2 and 3");
            }
        } else if (num < 0 ) {
            System.out.println("Numder is negative");

            if ((num % 2) == 0 && (num % 3) == 0) {
                System.out.println("Number is divisible by both 2 and 3");
            }
        } else {
            System.out.println("Number is zero");
        }
    }
}
