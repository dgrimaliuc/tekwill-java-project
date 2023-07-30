package alexei_drujinin;

import java.io.File;
import java.nio.file.Files;

public class CountingLines {
    public static void main(String[] args) {
        try {
            File MyFile2 = new File("src/main/java/alexei_drujinin/files/Welcome.txt");
            int countLines = Files.readAllLines(MyFile2.toPath()).size();

            System.out.println("The number of lines is: " + countLines);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
