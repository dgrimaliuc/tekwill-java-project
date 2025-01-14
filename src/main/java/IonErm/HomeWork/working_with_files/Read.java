package main.java.IonErm.HomeWork.working_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
//        try {
//            List<String> lines = Files.readAllLines(Path.of("resources/fileTest.txt"));
//            for (String line : lines) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }

            try {
                File file = new File("resources/fileTest.txt");
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String data = reader.nextLine();
                    System.out.println(data);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Something wrong...");
            }
    }
}
