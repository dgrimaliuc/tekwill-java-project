package ana_raetcaia.task_eight;


import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/main/resources/myFile.txt");
            myWriter.write("Welcome, dear friend!");
            myWriter.close();
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
