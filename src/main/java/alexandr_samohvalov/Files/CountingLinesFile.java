package alexandr_samohvalov.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingLinesFile {
    public static void main(String[] args) {
        String fileName = "src/main/resources/newfile";
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Number of lines in the file: " + lineCount);
    }
}
