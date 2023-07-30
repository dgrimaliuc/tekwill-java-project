package alexei_drujinin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTheFile {
    public static void main(String[] args) {
        try (Scanner out = new Scanner(new File("src/main/java/alexei_drujinin/files/Welcome.txt"))){
            while (out.hasNextLine())
                System.out.println(out.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
