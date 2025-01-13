package main.java.georgeVinaga.Learn_13_01_2025.ClassWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Main {
    //------------------------------------------------------
//    public static void main(String[] args) {
//        File file = new File("src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/index.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("File already exists");
//        }
//    }
    //------------------------------------------------------
    //Creează un fișier „resources.txt” dacă nu există.
//    public static void main(String[] args) {
//        var filename = "src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/resource1.txt";
//        System.out.println("Enter text: ");
//        Scanner sc = new Scanner(System.in);
//        var userInput = sc.nextLine();
//
//        File file = new File(filename);
//        try {
//            if (!file.exists()) { // ferifica daca nu exista fisieru resource.txt
//                file.createNewFile();
//            }
//            Files.writeString(file.toPath(), userInput);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    //------------------------------------------------------
    /* Creează un fișier „resources.txt” dacă nu există.
       Creează un program care cere utilizatorului să introducă un text și salvează-l într-un fișier text. */
//    public static void main(String[] args) {
//        var fileName = "src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/resource2.txt";
//        Scanner sc = new Scanner(System.in);
//        File file = new File(fileName);
//
//          // done
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            var userInput = "";
//            do {
//                System.out.println("Enter text: ");
//                userInput = sc.nextLine();
//                Files.writeString(file.toPath(), userInput + "\n", StandardOpenOption.APPEND);
//
//            } while (!userInput.equals("done"));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    //------------------------------------------------------
    /* Creează un program care cere utilizatorului să introducă un text și salvează-l într-un fișier text.
       Citește din fișier inputul utilizatorului și îl afișează. */
//    static String fileName = "src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/resource3.txt";
//    public static String readFormFile() throws IOException {
//        StringBuilder sc = new StringBuilder();
//        List<String> lines = Files.readAllLines(Path.of(fileName));
//
//        for (String line : lines) {
//            sc.append(line).append("\n");
//        }
//        return sc.toString();
//    }
//
//    public static void writeToFile(String text, boolean append) throws IOException {
//        if (append) {
//            Files.writeString(Path.of(fileName), text, StandardOpenOption.APPEND);
//        } else {
//            Files.writeString(Path.of(fileName), text);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter text: ");
//        String text = sc.nextLine();
//        try {
//            writeToFile(text, true);
//            System.out.println("The text from file:");
//            System.out.println(readFormFile());
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    //------------------------------------------------------
    /* Dezvoltă un program care citește un fișier text și calculează diverse statistici,
     cum ar fi numărul total de linii, cuvinte și caractere. */


    //------------------------------------------------------
    // Creează un program care caută un cuvânt sau o freză într-un fișier text și o înlocuiește cu alt cuvânt sau frază.


    //------------------------------------------------------
}
