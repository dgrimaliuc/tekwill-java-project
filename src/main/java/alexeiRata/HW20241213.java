package main.java.alexeiRata;

import java.util.Scanner;

public class HW20241213 {
    public static void main(String[] args) {
//Solicitati utilizatorului sa introduca virsta si verificati daca este minor sau adult
        Scanner sc = new Scanner(System.in);
        System.out.println("Ce virsta aveti?:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Multumim. Sunteti adult.");
        } else {
            System.out.println("Multumim. Sunteti minor.");
        }
    }
}
