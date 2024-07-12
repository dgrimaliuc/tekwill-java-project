package IrinaSamurenco;

import java.util.Scanner;

public class hometask1 {
    public static void main (String[] args) {
        int a = 25;
        int b = 15;
        int sum  = a+b;
        System.out.println("The Sum of numbers is :" + " " + sum);
        int dif = a-b;
        System.out.println("The number difference is :" + " " + dif);
        int mt = a*b;
        System.out.println("The multiplying  of numbers is :" + " " + mt);
        int div = a/b;
        System.out.println("The dividing of numbers is :" + " " + div);

        if (a<b) {
            System.out.println("a is the minimum number:" + " " + a);
        } else {
            System.out.println("b is the minimum number:" + " " + b);
        }


        Scanner age = new Scanner(System.in);
        System.out.println("How old are you?");
        int years = age.nextInt();
        if (years>=18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are underage of 18!");
        }
    }
}
