package anna_gontari;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        //Write a program that creates a new text file with a given name. Write a welcome message in the file.
        File newFile = new File("src/main/java/anna_gontari/files/MyFile.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter out = new FileWriter("src/main/java/anna_gontari/files/MyFile.txt")) {

            out.write("Welcome to the file");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
