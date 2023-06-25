package ana_raetcaia.task_seven;

import java.util.Scanner;

public class ParseToIntExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to convert to a number of int: ");
        String input = scanner.next();

        try {
            int number = convertToInt(input);
            System.out.println("Converted string to int: " + number);
        } catch (ParseToIntException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertToInt(String input) throws ParseToIntException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new ParseToIntException("Impossible to parse int from string: " + input);
        }
    }

    }

