package ana_raetcaia;

import java.util.Scanner;

public class ForMain {
    public static void main (String[]args){
        //1. Print numbers from 1 to 10 using a for loop
        for ( int x = 1; x<=10 ;x++){
            System.out.println("x= " + x);
        }
        //2. Calculate the sum of numbers from 1 to 100 using a for loop.
        int sum = 0;
        for ( int i = 0; i<=100 ;i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);

        //3. Calculate the factorial of a given number using a for loop.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for(int j=1; j <=num ; j++) {
            factorial *= j;
        }
        System.out.println("Factorial of a given number: " + factorial);


    }

}
