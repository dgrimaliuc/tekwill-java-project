package Leas_Liudmila.files;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//Write a program that creates a new text file with a given name. Write a welcome message in the file.
public class FileCreation {
    public static void main(String[] args) {
        newFileCreation();
        readContent();
    }

    public static void newFileCreation() {
        try {
            File myObj = new File("files/new_file.txt");


            if (myObj.createNewFile()) {
                System.out.println("New file is created: " + myObj.getName());

            } else {
                System.out.println("File already exists.");
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter myWriter = new PrintWriter("files/new_file.txt", StandardCharsets.UTF_8)) {
            myWriter.println("We welcome you warmly today!");
            myWriter.println("Seeing you here with us is a pleasure!");
            System.out.println("The file was successfully overwritten");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Write a program that reads the contents of a text file and displays it on the screen.
    public static void readContent() {
        try {
            File myObj = new File("files/new_file.txt");
            Scanner read = new Scanner(myObj);
            while (read.hasNextLine()) {
                String text = read.nextLine();
                System.out.println(text);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            e.printStackTrace();
        }

    }
}



