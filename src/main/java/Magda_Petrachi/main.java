package main.java.Magda_Petrachi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //task 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("esti adult");
//        } else {
//            System.out.println("esti minor");
//        }

        //task 1
        int num1 = 5;
        int num2 = 6;
        int sum = num1 + num2;
        int dif = num1 - num2;
        int multip = num1 * num2;
        int divi = num1 / num2;
        System.out.println("Suma: " + sum);
        System.out.println("Diferenta: " + dif);
        System.out.println("Inmultirea: " + multip);
        System.out.println("Impartirea: " + divi);
        int max1 = Math.max(sum, dif);
        int max2 = Math.max(max1, multip);
        int max3 = Math.max(max2, divi);
        System.out.println("Numarul maxim este" + max3);


//        int num = 40;
//        if (num > 0) {
//            System.out.println("numar pozitiv");
//        } else if (num < 0) {
//            System.out.println("numar negativ");
//        } else {
//            System.out.println("numarul e zero");
//        }

//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your nuber");
//        String name = sc.nextLine();
//        System.out.println("Hello: " + name);
//        System.out.println(1!=8);


//            int myAge = 25;
//            int votingAge = 18;
//            System.out.println(myAge >= votingAge);


//        int age = 15;
//        if (age >= 18) {
//            System.out.println("esti adult");
//        } else {
//            System.out.println("esti minor");
//        }

//        int num = 40;
//        if (num > 0) {
//            if (num % 2 == 0) {
//                System.out.println("numar pozitiv par");
//            } else {
//                System.out.println("numar pozitiv impar");
//            }
//        } else if (num < 0) {
//            System.out.println("numar negativ");
//        }else {
//            System.out.println("zero");
//        }
    }
}


