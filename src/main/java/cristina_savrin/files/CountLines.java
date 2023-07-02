package cristina_savrin.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static cristina_savrin.files.FileCreation.createFile;
import static cristina_savrin.files.FileCreation.writeToFile;

public class CountLines {

    public static void main(String[] args) {

        String file = "src/main/java/cristina_savrin/files/multiLines.txt";
        createFile(file);
        writeToFile(file, "Line1");
        writeToFile(file, "Line2");
        writeToFile(file, "Line3");
        writeToFile(file, "Line4");
        System.out.println("The file " + file + " contains " + countLines(file) + " lines");
    }

    // 4. Write a program that counts the number of lines in a text file and displays the result.
    public static int countLines(String filename) {

        int lines = 0;
        try {
            lines = Files.readAllLines(Path.of(filename)).size();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return lines;
    }
}