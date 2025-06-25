package main.java.alexandru_todos.workingWithFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void createAndWriteInFile(String path) {
        try {
            FileWriter file = new FileWriter(path);
            System.out.println("File created");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write new text to save in file:");
            String initialText = scanner.nextLine();
            file.write(initialText);
            file.close();
        } catch (IOException e) {
            System.out.println("File already exists or something went wrong");
            e.printStackTrace();
        }
    }

    public static void scanAndRewriteFile(String path, String textToLookFor, String textForReplace) {
        try {
            Path pathToFile = Paths.get(path);
            String content = new String(Files.readAllBytes(pathToFile));
            if (content.contains(textToLookFor)) {
                String newContent = content.replace(textToLookFor, textForReplace);
                Files.write(pathToFile, newContent.getBytes());
                System.out.println("Text replaced");
            } else {
                System.out.println("Nothing to replace");
            }
        } catch (IOException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "resources/homework.txt";
        String textToLookFor = "Random";
        String textForReplace = "Hello";
        createAndWriteInFile(path);
        scanAndRewriteFile(path, textToLookFor, textForReplace);
    }
}