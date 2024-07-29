package IvanTrembaci.src.main.java.SergheiRubailo.Task14;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args)  {

        String input;
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        input = scanner.nextLine();

        try {
            number = Integer.parseInt(input);
            System.out.println("Number: " + number);
        } catch (Exception e) {
            throw new PersonalNumberException("Impossible to parse int from string: " + input);
        }

    }
}
