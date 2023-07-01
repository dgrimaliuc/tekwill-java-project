package alina_gutsul.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        int lineCount = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.readLine() != null) {
                lineCount++;
            }

            bufferedReader.close();

            System.out.println("Number of lines in the file: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while counting lines: " + e.getMessage());
        }
    }
}

