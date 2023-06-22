package ana_raetcaia;

import java.util.Scanner;

public class BreakContinueMain {
    public static void main(String[] args) {

        //1.Create a program, which will ask user to enter a number, if number will be negative exit the loop
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a num: ");
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
        }
       //2.Create a program which will print all number from 1 to 10 except 3 and 7 using continue keyword
        for ( int x = 0; x< 10 ;x++){
            if (x == 3 && x == 7 ){

                continue;
            }
            System.out.println(x);
        }

    }
}
