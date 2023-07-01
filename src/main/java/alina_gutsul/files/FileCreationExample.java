package alina_gutsul.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Welcome to the file!");
            fileWriter.close();

            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}

