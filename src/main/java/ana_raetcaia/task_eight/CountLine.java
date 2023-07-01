package ana_raetcaia.task_eight;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CountLine {
    //Task 4: Counting Lines in a File
    //Write a program that counts the number of lines in a text file and displays the result.

    public static void main (String[]args){
        int line = 0;

       try {
           File myFile = new File("src/main/resources/myFile.txt");
           line = Files.readAllLines(myFile.toPath()).size();
       } catch (IOException e){
           e.printStackTrace();
       }

        System.out.println(line);
    }
}
