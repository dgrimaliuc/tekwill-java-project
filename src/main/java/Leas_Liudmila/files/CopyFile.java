package Leas_Liudmila.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CopyFile {
    //Write a program that copies the contents of one text file to another file. Have the user enter the names of the target file.
    public static void main(String[] args) {
        copyFile();
    }

    public static void copyFile() {
        System.out.println("Enter the file name from the 'files' folder to copy:");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println("Enter new file name:");
        String input2 = myScanner.nextLine();

        File path = new File("files/userFiles/");

        try {
            if (path.mkdir() == true) {
                Files.copy(Path.of("files/" + input), Path.of("files/userFiles/" + input2));
                System.out.println("The file has been copied successfully");
            } else if (path.mkdir() == false) {
                Files.copy(Path.of("files/" + input), Path.of("files/userFiles/" + input2));
                System.out.println("The file has been copied successfully");
            } else {
                System.out.println("files/userFiles directory cannot be created");
            }


        } catch (IOException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}


