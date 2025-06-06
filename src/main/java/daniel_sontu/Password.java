package main.java.daniel_sontu;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        //Implementea un program care cere utilizatorului o parola pana cand parola corecta este introdusa

        Scanner sc = new Scanner(System.in);
        String introducedPassword = "";
        String correctPassword = "aaaa!";


        do {
            System.out.println("Introdu parola");
            introducedPassword = sc.nextLine();

            if (introducedPassword.equals(correctPassword)) {
                System.out.println("Parola este corecta !");
            } else {
                System.out.println("Parola este gresita ! Incearca iarasi");
            }

        } while (!introducedPassword.equals(correctPassword));
    }
}

