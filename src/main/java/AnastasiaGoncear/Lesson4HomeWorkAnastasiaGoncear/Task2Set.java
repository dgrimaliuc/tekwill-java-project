package AnastasiaGoncear.Lesson4HomeWorkAnastasiaGoncear;

import java.util.HashSet;
import java.util.Scanner;

//Create a Set of strings and add some names to it.
//Print the size of the Set and check if a specific name exists in the Set.
public class Task2Set {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Hanna");
        names.add("William");
        names.add("Tomas");
        names.add("Iris");
        names.add("John");
        System.out.println("The length of the string is:" + " " + names.size());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is in the HashSet:");

        String input = scanner.nextLine();

        // Check if the HashSet contains the input element
        if (names.contains(input)) {
            System.out.println("The HashSet contains: " + input);
        } else {
            System.out.println("The HashSet does not contain: " + input);
        }
    }
}

