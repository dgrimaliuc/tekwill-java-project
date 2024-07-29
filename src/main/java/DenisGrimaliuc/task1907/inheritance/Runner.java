package DenisGrimaliuc.task1907.inheritance;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Create a file “resources.txt” if it doesn't exist.
        // Create a program that prompts the user for input and saves it to a text file.
        var fileName = "resources2.txt";
        Scanner sc = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(fileName)) {

            if (!Files.exists(Path.of(fileName))) {
                Files.createFile(Path.of(fileName));
            }

            System.out.println("Enter text: ");
            var input = sc.nextLine();
            writer.println(input);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
