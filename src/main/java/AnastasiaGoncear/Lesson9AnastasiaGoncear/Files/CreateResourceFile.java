package AnastasiaGoncear.Lesson9AnastasiaGoncear.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateResourceFile {
    public static void main(String[] args) {
        try {
            // Specify the directory and file name
            File directory = new File("resources");

            // Create the directory if it does not exist
            if (!directory.exists()) {
                if (directory.mkdir()) {
                    System.out.println("Directory created: " + directory.getName());
                } else {
                    System.out.println("Failed to create directory.");
                }
            } else {
                System.out.println("Directory already exists.");
            }

            // Create the file in the specified directory
            File myFile = new File(directory, "resource.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write("This is the content of the resource file.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}