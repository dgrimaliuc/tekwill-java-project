package main.java.daniel_sontu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) {
        String fileName = "src/main/java/daniel_sontu/fileName.txt";
        File file = new File(fileName);
        String textFromFile = readFromFile(file);

        System.out.println("Textul din fișier este:\n" + textFromFile);
        System.out.println("Numărul total de linii: " + textFromFile.split("\n").length);
        System.out.println("Numărul total de cuvinte: " + textFromFile.split("\\s+").length);
        System.out.println("Numărul total de caractere: " + textFromFile.length());
    }

    public static String readFromFile(File file){
        StringBuilder result = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            for (String line : lines) {
                result.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        return result.toString();
    }
}
