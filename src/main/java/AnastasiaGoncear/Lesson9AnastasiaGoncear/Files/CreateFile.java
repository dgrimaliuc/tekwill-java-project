package AnastasiaGoncear.Lesson9AnastasiaGoncear.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the content you want to save to resources.txt:");
        String userInput = scanner.nextLine();

        try {
            // Specify the file name
            File myFile = new File("resources.txt");

            // Create the file if it does not exist
            if (!myFile.exists()) {
                if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                } else {
                    System.out.println("Failed to create file.");
                }
            } else {
                System.out.println("File already exists.");
            }

            // Write user input to the file
            FileWriter myWriter = new FileWriter(myFile, true); // 'true' enables appending to the file
            myWriter.write(userInput + System.lineSeparator());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}