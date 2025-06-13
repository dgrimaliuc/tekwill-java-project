package main.java.daniel_sontu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayChallenge {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Introduceti un element (sau 'done' pentru a termina): ");
            input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            } else {
                list.add(input);
            }
        } while (!input.equals("done"));

        System.out.println("Lista finala: " + list);
    }
}
