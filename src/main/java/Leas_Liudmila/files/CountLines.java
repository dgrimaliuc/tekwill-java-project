package Leas_Liudmila.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

//Write a program that counts the number of lines in a text file and displays the result.
public class CountLines {

    public static void main (String[] args){
        countLines();
    }
    public static void countLines(){
        try{
            File myFile = new File("files/new_file.txt");
            int countLines = Files.readAllLines(myFile.toPath()).size();
            System.out.println("Number of lines in the file: " + countLines);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
