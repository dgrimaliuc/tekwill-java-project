package main.java.PotoracMihai.lesson29_07_2024;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    //Create a file and enter some lines of text, create a method to read file content and print it.
    public static String readFromFile(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        var fileName = "resources//source1.txt";
        /*try (PrintWriter writer = new PrintWriter(fileName)) {
            if (!Files.exists(Path.of(fileName))) {
                Files.createFile(Path.of(fileName));
            }
            // System.out.println("Enter text: ");
            var input = "Potorac Mihai";
            writer.println(input);
            List<String> lines = Files.readAllLines(Path.of(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        readFromFile(fileName);
    }
}
