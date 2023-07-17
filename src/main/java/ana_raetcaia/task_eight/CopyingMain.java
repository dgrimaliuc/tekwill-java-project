package ana_raetcaia.task_eight;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class CopyingMain {
    //Task 3: Copying a file
    //Write a program that copies the contents of one text file to another file.
    // Have the user enter the names of the  target file.

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        String userInput;
        System.out.println("Enter name of target file: ");

        userInput = sc.nextLine();

        try {
            Files.copy(Path.of("src/main/resources/sourceFile.txt"),Path.of("src/main/resources/"+userInput+ ".txt"));


        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
        }
}
