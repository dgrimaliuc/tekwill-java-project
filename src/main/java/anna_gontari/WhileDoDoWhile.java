package anna_gontari;

import java.util.Scanner;

public class WhileDoDoWhile {
    public static void main(String[] args) {
        //Print numbers from 1 to 10 using a while-do loop
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        //Calculate the sum of numbers from 1 to 100 using a do-while loop.
        int sum = 0;
        int a = 1;
        do {
            sum += a;
            a++;
        } while (a <= 100);
        System.out.println("The sum is " + sum);

        //Print the even numbers from 1 to 20 using a while-do loop
        int number, h;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        number = sc.nextInt();
        h=2;
        System.out.print("The list of even numbers: ");
        while(h<=number)
        {
            System.out.print(h +" ");
            h=h+2;
        }
    }
}
