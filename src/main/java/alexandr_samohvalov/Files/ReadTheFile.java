package alexandr_samohvalov.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile {
    public static void main(String[] args) {
        String fileName = "src/main/resources/welcome.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

