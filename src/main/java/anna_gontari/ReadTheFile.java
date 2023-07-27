package anna_gontari;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTheFile {
    //Write a program that reads the contents of a text file and displays it on the screen.
    public static void main(String[] args) {
        try (Scanner out = new Scanner(new File("src/main/java/anna_gontari/files/MyFile.txt"))){
            while (out.hasNextLine())
                System.out.println(out.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
