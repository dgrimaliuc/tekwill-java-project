package alexei_drujinin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        File newFile = new File("src/main/java/alexei_drujinin/files/Welcome.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter out = new FileWriter("src/main/java/alexei_drujinin/files/Welcome.txt")) {

            out.write("Welcome to the file");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
