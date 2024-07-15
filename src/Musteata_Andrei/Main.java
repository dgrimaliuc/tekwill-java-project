package Musteata_Andrei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int sum = x + y;
        int difference = x - y;
        int multiplication = x * y;
        int division = x / y;
        System.out.println("sum=" + sum + "\ndifference=" + difference +
                "\nmultiplication=" + multiplication + "\ndivision" + division);
        if (x>y){
            System.out.println(x);
        }else {
            System.out.println(y);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int i = scanner.nextInt();
        if (i>=18){
            System.out.println("You're totally summery");
        }else {
            System.out.println("You're not totally summery");
        }
    }
}
