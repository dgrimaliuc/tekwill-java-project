package anna_gontari;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

//Write a program that copies the contents of one text file to another file. Have the user enter the names of the  target file.
public class CopyingFile {
    public static void main(String[] args) {
        copyFile();
    }
    public static void copyFile() {
        System.out.println("Please, enter file's path from which you want to copy information: ");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        System.out.println("Please enter new file name:");
        String input2 = scanner.nextLine();

        File path = new File("New Folder/copy Files/new Files");
        try {
            if (path.mkdir() == true) {
                Files.copy(Path.of("New Folder/copy Files/new Files" + input1), Path.of("New Folder/copy Files/new Files" + input2));
                System.out.println("Requested file was found and information was successfully copied");
            } else if (path.mkdir() == false) {
                Files.copy(Path.of("New Folder/copy Files/new Files" + input1), Path.of("New Folder/copy Files/new Files" + input2));
                System.out.println("Requested file was found and information was successfully copied");
            } else {
                System.out.println("Sorry, new Files directory cannot be created");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
