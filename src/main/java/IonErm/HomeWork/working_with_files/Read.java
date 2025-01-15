package main.java.IonErm.HomeWork.working_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Read {
    static String myFile = "resources/fileTest.txt";

    public static void readerWithList() {
        try {
            List<String> lines = Files.readAllLines(Path.of(myFile));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File(myFile);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something wrong...");
        }

        readerWithList();
    }
}
