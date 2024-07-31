package main.java.ChirilBortnicov.Lesson2907;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class File {
    public static void main(String[] args) throws IOException {

        java.io.File newFile = new java.io.File("Resources/fullName.txt");
        newFile.createNewFile();

        var fullName = "Resources/fullName.txt";

        try (PrintWriter writer = new PrintWriter(fullName)) {

            if (!Files.exists(Path.of(fullName))) {
                Files.createFile(Path.of(fullName));
            }

            writer.println("Chiril Bortnicov");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Create a file and enter some lines of text, create a method
        // to read file content and print it.
        java.io.File newFile2 = new java.io.File("Resources/Print.txt");
        newFile2.createNewFile();
        try {
            List<String> lines = Files.readAllLines(Path.of("Resources/Print.txt"));
            lines.add("Teeeeeext");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
