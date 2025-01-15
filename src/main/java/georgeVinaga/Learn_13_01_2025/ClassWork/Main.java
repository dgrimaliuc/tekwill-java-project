package main.java.georgeVinaga.Learn_13_01_2025.ClassWork;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Main {
    //------------------------------------------------------
//    public static void main(String[] args) {
//        try {
//            File myObj = new File("src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/filename.txt");
//
//            // Create a file
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists."); // daca fisieru exista nul va crea cu acelasi nume.
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
    //------------------------------------------------------
    // Metoda mai usoara de a crea un fisier.
//    public static void main(String[] args) {
//        try {
//            Files.createFile(Path.of("src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/filename2.txt"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    //------------------------------------------------------
    // Obțineți informații despre fișier
//    public static void main(String[] args) {
//        File myObj = new File("src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/filename.txt");
//        if (myObj.exists()) {
//            System.out.println("File name: " + myObj.getName());
//            System.out.println("Absolute path: " + myObj.getAbsolutePath());
//            System.out.println("Writeable: " + myObj.canWrite());
//            System.out.println("Readable: " + myObj.canRead());
//            System.out.println("File size in bytes " + myObj.length());
//        } else {
//            System.out.println("The file dowse not exist.");
//        }
//    }
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
    //Delete a file
//    public static void main(String[] args) {
//        File file = new File("src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/index.txt");
//        if (file.delete()) { // file.delete sterge fisieru
//            System.out.println("File deleted successfully");
//        } else {
//            System.out.println("File can not be deleted");
//        }
//    }
    //------------------------------------------------------
    // Creează un fișier „resources.txt” in directoriul „resources”.
//    public static void main(String[] args) {
//        File file = new File("src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/resource1.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("File created successfully");
//            } else {
//                System.out.println("File already exists");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    //------------------------------------------------------
    // Scriem într-un fișier cu OutputStream
//    public static void writeToFile() {
//        String filePath = "src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/resource1.txt";
//        String content = "Hello, World";
//        try (OutputStream outputStream = new FileOutputStream(filePath)) {
//            // Convertim conținutul într-un tablou de octeți și îl scriem în fișier
//            byte[] bytes = content.getBytes();
//            outputStream.write(bytes);
//            System.out.println("Data written to the file successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        writeToFile(); // Apelăm metoda pentru a scrie datele în fișier
//    }
    //------------------------------------------------------
    // Scriem date in fisier folosind metoda List
//    public static void main(String[] args) {
//        var fileName = "src/main/java/georgeVinaga/Learn_13_01_2025/ClassWork/resources/resource1.txt";
//        try {
//            Files.write(Path.of(fileName), List.of("Hello, World 111", "Hello, World 2222")); // Daca in fisier este ceva el va rescrie de la inceput, astfel datele anterioare se vor pierde.
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    //------------------------------------------------------
    //Creează un fișier „resources.txt” dacă nu există, folosind Scanner.
    // Creează un program care cere utilizatorului să introducă un text și salvează-l într-un fișier text.
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
//            throw new RuntimeExceptio n(e);
//        }
//    }
    //------------------------------------------------------
    /* Creează un fișier „resources.txt” dacă nu există.
       Creează un program care cere utilizatorului să introducă un text și salvează-l într-un fișier text.
       Propramu se inchide dupa ce userul va scrie cuvindu „done” */
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
//            } while (!userInput.equals("done"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    //------------------------------------------------------


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
