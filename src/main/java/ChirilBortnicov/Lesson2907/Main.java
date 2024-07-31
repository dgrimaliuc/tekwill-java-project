package IvanTrembaci.src.main.java.ChirilBortnicov.Lesson2907;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write what you want to convert into a number:");
        String str = sc.nextLine();

        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted string to number" + number);
        } catch (NumberFormatException e){
            throw new PersonalNumberException("Impossible to parse int from string: " + str);
        }
    }
}
