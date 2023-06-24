package ana_raetcaia;

import java.util.Scanner;

public class IfElseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = scanner.nextInt();

      if (num > 0) {
          System.out.println("Numbr is positive");

            if ((num > 0) && (num % 2) == 0 && (num % 3) == 0) {
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

        switch (num/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
}
