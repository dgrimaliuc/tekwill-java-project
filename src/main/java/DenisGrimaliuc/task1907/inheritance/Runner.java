package DenisGrimaliuc.task1907.inheritance;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class Runner {
    /*
            // Write a program that reads a text file and counts the total number of words in it.
        var fileName = "resources/file.txt";
        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));

            int count = 0;
            for (String line : lines) {
                String[] words = line.split(" ");
                count += words.length;
            }
            System.out.println("Total number of words in the file: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }

         // Description: Develop a program that reads a text file and calculates various statistics
        // such as the total number of lines, words, and characters.

        var fileName = "resources/file.txt";
        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));

            int wordsCount = 0;
            int charCount = 0;
            for (String line : lines) {
                String[] words = line.split(" ");
                String[] characters = line.split("");
                wordsCount += words.length;
                charCount += characters.length;
            }
            System.out.println("Total number of lines in the file: " + lines.size());
            System.out.println("Total number of words in the file: " + wordsCount);
            System.out.println("Total number of characters in the file: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }


                // Develop a program that searches for a specific word or phrase in a text
        // file and replaces it with another word or phrase.
        var fileName = "resources/file.txt";
        String content = readFromFile(fileName);
        content = content.replaceAll("Hi", "Hello");
        writeToFile(fileName, content);

        String encodedString = new String(Base64.getEncoder().encode("123123".getBytes(StandardCharsets.UTF_8)));
        System.out.println(encodedString);

        // Write a program that reads username and password from user and saves it in a file.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        String encodedString = encode(username + ":" + password);
        writeToFile("resources/credentials.txt", encodedString);
        // Decode and print
        String content = readFromFile("resources/credentials.txt");
        String decoded = decode(content);
        System.out.println("Credentials: " + decoded);

     */

    public static void writeToFile(String fileName, String content) {
        try {
            Path path = Path.of(fileName);
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to write to file" + fileName, e);
        }
    }

    public static String readFromFile(String fileName) {
        try {
            return Files.readString(Path.of(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to read from file" + fileName, e);
        }
    }

    public static String encode(String text) {
        return new String(Base64.getEncoder().encode(text.getBytes(StandardCharsets.UTF_8)));
    }

    public static String decode(String text) {
        return new String(Base64.getDecoder().decode(text.getBytes(StandardCharsets.UTF_8)));
    }

    public static void deleteDirectory(File directory) {
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteDirectory(file); // Recursively delete subdirectories
                    } else {
                        boolean deleted = file.delete();
                        if (deleted) {
                            System.out.println("Deleted file: " + file.getAbsolutePath());
                        } else {
                            System.out.println("Failed to delete file: " + file.getAbsolutePath());
                        }
                    }
                }
            }
            boolean deleted = directory.delete();
            if (deleted) {
                System.out.println("Deleted directory: " + directory.getAbsolutePath());
            } else {
                System.out.println("Failed to delete directory: " + directory.getAbsolutePath());
            }
        } else {
            System.out.println("Directory does not exist.");
        }
    }


    public static void main(String[] args) {
        deleteDirectory(new File("resources/res2"));

    }

    // Hello world!! 2
    // ["Hello", "world!!", "2"]
}
