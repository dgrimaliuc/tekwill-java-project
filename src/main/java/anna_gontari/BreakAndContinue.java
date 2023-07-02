package anna_gontari;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
//Create a program, which will ask user to enter a number, if number will be negative exit the loop
        Scanner numInput = new Scanner(System.in);
        int x = 0;
        System.out.println("Enter a series of numbers. Enter a negative number to quit.");
        while (numInput.hasNextInt()) {
            int negX = numInput.nextInt();
            if (negX >= 0) {
                x += negX;
            } else {
                break;
            }
        }
//Create a program which will print all number from 1 to 10 except 3 and 7 using continue keyword
        int i;
        for(i=1;i<=10;i++)
        {
            if(i==3) continue;
            if(i==7) continue;
            System.out.print(i +" ");
        }
    }
}

