package alina_gutsul.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordReplacementExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "example.txt";
        String searchWord;
        String replacementWord;

        System.out.print("Enter the word to replace: ");
        try {
            searchWord = reader.readLine();

            System.out.print("Enter the new word: ");
            replacementWord = reader.readLine();

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder contentBuilder = new StringBuilder();
            String line;
            boolean wordReplaced = false;
            while ((line = bufferedReader.readLine()) != null) {
                String modifiedLine = line.replaceAll("\\b" + searchWord + "\\b", replacementWord);
                if (!modifiedLine.equals(line)) {
                    wordReplaced = true;
                }
                contentBuilder.append(modifiedLine).append("\n");
            }

            bufferedReader.close();

            if (wordReplaced) {
                String fileContent = contentBuilder.toString();

                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(fileContent);
                bufferedWriter.close();

                System.out.println("Word replaced successfully.");
            } else {
                System.out.println("The word to replace does not exist in the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while performing word replacement: " + e.getMessage());
        }
    }
}
