package anna_gontari;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

//Write a program that counts the number of lines in a text file and displays the result.
public class CountingLines {
    public static void main(String[] args) {
        try {
            File MyFile2 = new File("src/main/java/anna_gontari/files/MyFile2.txt");
            int countLines = Files.readAllLines(MyFile2.toPath()).size();

            System.out.println("The number of lines is: " + countLines);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

