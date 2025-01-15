package main.java.IonErm.HomeWork.working_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class MainFiles {
    public static void main(String[] args) {
        File myFile = new File("resources/fileTest.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("File already exists");
        }
        /*1*/
        Scanner scanner = new Scanner(System.in);
        try {
            if (!myFile.exists()) {
                myFile.createNewFile();
            }
            var input = "";
            do {
                System.out.println("Please, put your text: ");
                input = scanner.nextLine();
                Files.writeString(myFile.toPath(), input + "\n", StandardOpenOption.APPEND);
            } while (!input.equals("done"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
