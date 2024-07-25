package AnastasiaGoncear.Lesson8AnastasiaGoncear.Exceptions.Homework;

import java.util.Scanner;

public class NumberParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println(STR."The parsed number is: \{number}");
        } catch (NumberFormatException e) {
            throw new PersonalNumberException(STR."Impossible to parse int from string: \{input}");
        } finally {
            scanner.close();
        }
    }
}