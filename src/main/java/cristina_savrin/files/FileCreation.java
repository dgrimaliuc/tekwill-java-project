package cristina_savrin.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class FileCreation {

    public static void main(String[] args) {

        String sourceFile = "src/main/java/cristina_savrin/files/file1.txt";
        String message = "Welcome to TXT file!";

        createFile(sourceFile);
        writeToFile(sourceFile, message);
        readFile(sourceFile);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide destination file name to copy to: ");
        String targetFilename = scanner.nextLine();

        String targetFile = "src/main/java/cristina_savrin/files/" + targetFilename;
        createFile(targetFile);
        copyContents(sourceFile, targetFile);
        readFile(targetFile);
    }


    // 1. Write a program that creates a new text file with a given name. Write a welcome message in the file.
    public static void createFile(String filename) {

        try {
            Files.createFile(Path.of(filename));
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String filename, String message) {

        try {
            Files.writeString(Path.of(filename), message + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
    }

    // 2. Write a program that reads the contents of a text file and displays it on the screen.
    public static void readFile(String filename) {

        Path pathToFile = Path.of(filename);
        StringBuilder contents = new StringBuilder();

        if (Files.exists(pathToFile)) {
            try {
                List<String> lines = Files.readAllLines(pathToFile);
                for (String line : lines) {
                    contents.append(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading from file");
                e.printStackTrace();
            }
            System.out.println(contents);
        } else {
            System.out.println("The file does not exist.");
        }
    }

    // 3. Write a program that copies the contents of one text file to another file. Have the user enter the names of the target file.

    public static void copyContents(String sourceFile, String targetFile) {

        String line, contents = "";

        try {
            FileReader fr = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fr);

            for (line = br.readLine(); line != null; line = br.readLine())
                contents = contents + line + "\n";

            br.close();

            try {
                FileWriter fw = new FileWriter(targetFile);
                fw.write(contents);
                fw.close();
                System.out.println("\nContents copied successfully!");
            } catch (IOException ioe) {
                System.out.println("\nAn exception occurred: " + ioe);
            }
        } catch (IOException ioe) {
            System.out.println("\nAn exception occurred: " + ioe);
        }
    }
}