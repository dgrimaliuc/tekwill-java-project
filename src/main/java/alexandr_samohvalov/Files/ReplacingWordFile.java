package alexandr_samohvalov.Files;

import java.io.*;
import java.util.Scanner;

public class ReplacingWordFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".temp"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll(wordToReplace, newWord);
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Word replaced successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while replacing the word: " + e.getMessage());
            e.printStackTrace();
        }

        // Rename the temp file to the original file name
        try {
            File originalFile = new File(fileName);
            File tempFile = new File(fileName + ".temp");
            if (tempFile.renameTo(originalFile)) {
                System.out.println("Changes saved to the file.");
            } else {
                System.out.println("Failed to save changes to the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while saving changes to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
