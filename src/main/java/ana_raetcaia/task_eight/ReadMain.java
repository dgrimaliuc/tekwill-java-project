package ana_raetcaia.task_eight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMain {
    //Task 2: Read the file
    //Write a program that reads the contents of a text file and displays it on the screen.
    public static void main (String[]args){

        try (Scanner out = new Scanner(new File("src/main/resources/myFile.txt"))) {
            while (out.hasNextLine())
                System.out.println(out.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
