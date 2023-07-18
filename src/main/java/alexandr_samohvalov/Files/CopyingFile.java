package alexandr_samohvalov.Files;

import java.io.*;
import java.util.Scanner;

public class CopyingFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the source file: ");
        String sourceFileName = scanner.nextLine();

        System.out.print("Enter the name of the target file: ");
        String targetFileName = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
