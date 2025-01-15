package main.java.IonErm.HomeWork.working_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        File file = new File("resources/example.json");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        try {
            Files.writeString(file.toPath(), input + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
