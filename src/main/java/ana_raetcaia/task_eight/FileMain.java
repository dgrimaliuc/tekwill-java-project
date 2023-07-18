package ana_raetcaia.task_eight;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileMain {
    //Task 1: File Creation
    //Write a program that creates a new text file with a given name. Write a welcome message in the file.

    public static void main (String[]args){
        File myFile = new File("src/main/resources/myFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
