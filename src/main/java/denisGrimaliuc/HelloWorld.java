package main.java.denisGrimaliuc;

import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
//      // Verifică dacă un număr este pozitiv, negativ sau zero.
//        int number = 0;
//        if(number > 0) {
//            System.out.println("Num is more than 0");
//        }else if( number < 0) {
//            System.out.println("Num is less than 0");
//        }else {
//            System.out.println("Num is 0");
//        }

//        //Determină dacă un număr este par sau impar.
//        int number = 1;
//        if (number % 2 == 0) {
//            System.out.println("Num is par");
//        } else {
//            System.out.println("Num is impar");
//        }
//
//        // Verifică dacă un număr este divizibil cu 2 și 3.
//        int number = 2;
//
//        if (number % 2 == 0 && number % 3 == 0) {
//            System.out.println("Num is divisible by 2 and 3");
//        } else {
//            System.out.println("Num is not divisible by 2 and 3");
//        }

        // Citește un șir de caractere de la utilizator și afișează lungimea acestuia
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String length is: " + str.length());
    }
}
