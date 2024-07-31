package AnastasiaGoncear.Lesson9AnastasiaGoncear.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadWrite { public static void main(String[] args) {
    String fileName = "example.txt";
    String[] lines = {
            "This is the first line.",
            "This is the second line.",
            "This is the third line."
    };

    // Write lines to file
    writeToFile(fileName, lines);

    // Read and print file content
    readFromFile(fileName);
}

    public static void writeToFile(String fileName, String[] lines) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, List.of(lines));
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
