package cristina_savrin.files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static cristina_savrin.files.FileCreation.*;

public class ReplaceWord {
    public static void main(String[] args) {

        String file = "src/main/java/cristina_savrin/files/replaceWord.txt";
        createFile(file);
        writeToFile(file, "Write a program that reads the contents of a text file, asks the user for a replacement word and a new word.\n" +
                " The program must replace all occurrences of a given word with a new word and save the changes in the file.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter Replacement Word: ");
        String replacementWord = scanner.nextLine();

        System.out.print("Please enter New Word: ");
        String newWord = scanner.nextLine();

        replaceWord(file, replacementWord, newWord);
        System.out.println("The new contents of the file: ");
        readFile(file);
    }

    // 5. Write a program that reads the contents of a text file, asks the user for a replacement word and a new word.
    // The program must replace all occurrences of a given word with a new word and save the changes in the file.
    public static void replaceWord(String filename, String replacementWord, String newWord) {

        Path path = Paths.get(filename);
        Charset charset = StandardCharsets.UTF_8;

        String contents = "";
        try {
            contents = Files.readString(path, charset);
        } catch (IOException e) {
            System.out.println("\nAn exception occurred: " + e);
        }
        contents = contents.replaceAll(replacementWord, newWord);
        try {
            Files.write(path, contents.getBytes(charset));
        } catch (IOException e) {
            System.out.println("\nAn exception occurred: " + e);
        }
    }
}