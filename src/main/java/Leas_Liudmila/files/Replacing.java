package Leas_Liudmila.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//Replacing a word in a file
//Write a program that reads the contents of a text file, asks the user for a replacement word and a new word.
//The program must replace all occurrences of a given word with a new word and save the changes in the file.
public class Replacing {

    public static void main(String[] args) {
        readAndReplaceContent();
    }

    public static void readAndReplaceContent() {
        try {
            String fileLocation = "files/new_file.txt";
            File myFile = new File(fileLocation);
            Scanner read = new Scanner(myFile);

            String fileContent = "";
            while (read.hasNextLine()) {
                String text = read.nextLine();
                System.out.println(text);
                fileContent += text + '\n';
            }
            read.close();

            System.out.println("Enter a replacement word:");
            Scanner myScanner = new Scanner(System.in);
            String inputFind = myScanner.nextLine();
            System.out.println("Enter a new word:");
            String inputReplace = myScanner.nextLine();

            fileContent = fileContent.replace(inputFind, inputReplace);

            System.out.println(fileContent);

            PrintWriter myWriter = new PrintWriter(fileLocation, StandardCharsets.UTF_8);
            myWriter.println(fileContent);
            System.out.println("The file was successfully overwritten");

            myWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File is not found");
            e.printStackTrace();
        }
    }
}
