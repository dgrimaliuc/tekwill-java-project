package main.java.cristinamocanu;

import java.util.Scanner;
public class TaskVariables {
    public static void main(String[] args) {

        int A = 34;
        int B = 5;
        System.out.println(A + B);

            int J = 6;
            int H = 3;
            System.out.println(J - H);


        int N = 4;
        int M = 2;
        System.out.println(N * M);

        int Num1 = 3;
        int Num2 = 1;
        System.out.println(Num1 / Num2);

        int L = 7;
        int D = 4;

        if (L < D) {
            System.out.println("Cel mai mic numar este" +  L);
        } else {
            System.out.println("Cel mai mic numar este" +  D);

        }

            Scanner yourAge = new Scanner(System.in);
            System.out.println("Ce varsta aveti:");
            int str = yourAge.nextInt();


            if (str >= 18) {
                System.out.println("Sunteti major");
            } else {
                System.out.println("Nu sunteti major");
            }


        } }