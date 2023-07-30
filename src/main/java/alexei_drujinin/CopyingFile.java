package alexei_drujinin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CopyingFile {
    public static void main(String[] args) {
        copyFile();
    }
        public static void copyFile() {
            System.out.println("enter file from where copy information: ");
            Scanner scanner = new Scanner(System.in);
            String input1 = scanner.nextLine();
            System.out.println("enter new file name:");
            String input2 = scanner.nextLine();

            File path = new File("New Folder/copy Files/new Files");
            try {
                if (path.mkdir()) {
                    Files.copy(Path.of("New Folder/copy Files/new Files" + input1), Path.of("New Folder/copy Files/new Files" + input2));
                    System.out.println("Requested file was found and information was successfully copied");
                } else if (path.mkdir()) {
                    Files.copy(Path.of("New Folder/copy Files/new Files" + input1), Path.of("New Folder/copy Files/new Files" + input2));
                    System.out.println("Requested file was found and information was successfully copied");}
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
