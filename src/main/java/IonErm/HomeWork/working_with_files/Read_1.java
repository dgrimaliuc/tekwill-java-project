package main.java.IonErm.HomeWork.working_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Read_1 {
    static String myFile = "resources/fileTest.txt";

    public static String readFromFile() throws IOException {
        StringBuilder string = new StringBuilder();
        List<String> lines = Files.readAllLines(Path.of(myFile));
        for (String line : lines) {
            string.append(line).append("\n");
        }
        return string.toString();
    }

    public static void writeToFile(String text, boolean append) throws IOException {
        if (append) {
            Files.writeString(Path.of(myFile), text + "\n", StandardOpenOption.APPEND);
        } else {
            Files.writeString(Path.of(myFile), text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        try {
            writeToFile(text, true);
            System.out.println("The text from file:");
            System.out.println(readFromFile());
        } catch (IOException e) {
            throw new RuntimeException();

        }
    }
}

