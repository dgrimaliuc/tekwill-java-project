package main.java.IonErm.HomeWork.working_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Total {
    static String myFile = "resources/fileTest.txt";

    public static String readFromFile() throws IOException {
        StringBuilder string = new StringBuilder();
        List<String> lines = Files.readAllLines(Path.of(myFile));
        for (String line : lines) {
            string.append(line).append("\n");
        }
        return string.toString();
    }

    public static void main(String[] args) {
        try {
            String text = readFromFile();
            System.out.println("Total lines exist: " + text.split("\n").length);
            System.out.println("Total words exist: " + text.split("(\n|\s)").length);
            System.out.println("Total character exist: " + text.split("").length);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
