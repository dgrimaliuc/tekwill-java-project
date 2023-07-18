package alexandr_samohvalov.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        String fileName = "src/main/resources/welcome.txt"; // The name of the new text file

        try {
            // Create a new file with the specified name
            File file = new File(fileName);

            // Create a FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(file);

            // Create a BufferedWriter to write content efficiently
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write the welcome message to the file
            String welcomeMessage = "Welcome to our text file!";
            bufferedWriter.write(welcomeMessage);

            // Close the BufferedWriter to save and release resources
            bufferedWriter.close();

            System.out.println("Text file created and welcome message written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}