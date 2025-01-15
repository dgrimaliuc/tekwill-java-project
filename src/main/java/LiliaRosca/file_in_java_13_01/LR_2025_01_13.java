package main.java.LiliaRosca.file_in_java_13_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class LR_2025_01_13 {

    // files in Java
// metodele pentru File - informatie despre fisier, etc
    //canRead(); canWrite(); length(); mkdir(); s.a.

    /*     public static void main(String[] args) {
        //crearea fisier
               File file = new File("index.txt"); // relative path; absolute path C:\\.... sau Path - clasa auxeliara pentru lucru cu caile
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("File already exists");
                }
                // sau cu clasa Files fara crearea obiectului
                public static void createFile() {
                    try {
                            Files.createFile(Path.of("index.txt"))
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                }

                // informatie despre fisier
                File myObj = new File("index.txt"); // import java.io.File;
                if (myObj.exists()) {
                    System.out.println("File name - " + myObj.getName());
                    System.out.println("Absolute path - " + myObj.getAbsolutePath());
                    System.out.println("File size - " + myObj.length());
                } else {
                    System.out.println("File not found");
                }

                // stergerea fisier, mapa (trebuie sa fie goala) - index.txt
                // pentru a sterge mapa indicam calea spre mapa - File myObj = new File("C:\\Users\...\directory");
                File myObj = new File("index.txt"); // import java.io.File;
                if (myObj.delete()) {
                    System.out.println("File deleted successfully!");
                } else {
                    System.out.println("File cannot be deleted");
                }

                // exercitii in clasa - crearea fisier resources.txt in folder resources
                File file = new File("resources/resources.txt"); // import java.io.File;
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("File already exists");
                }
            }*/
// input streams - pentru citirea datelor din fisiere
// output streams - pentru a scrie informatie in fisiere
    // scrierea informatiei in fisier
/*     public static void main(String[] args) {
        // intr-un rind, ca lista, etc. prin metoda write / println page 22 / etc
       var fileName = "resources/resources.txt";
        try {
            //Files.write(Path.of(fileName), "Hello, people!".getBytes()); // bytes
            // sau
            Files.write(Path.of(fileName), List.of("Hello, people!", "Hello, folks!")); // list + import java.util.List;
        } catch (IOException e) {
            throw new RuntimeException(e); // sau e.printStackTrace();

        }*/

    // exercitiu cu introducerea textului de catre utilizator
/*        var fileName = "resources/resources.txt";
        System.out.println("Enter text: ");
        Scanner sc = new Scanner(System.in); //import java.util.Scanner;
        var userInput = sc.nextLine();

        File file = new File(fileName); //import java.io.File;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            Files.writeString(file.toPath(), userInput); // default rescrie tot ce este in fiier - trebuie de adaugat optiunea APPEND
        } catch (IOException e) { //import java.io.IOException;
            throw new RuntimeException(e);
        }
        // pina cind userul introduce done
        var fileName = "resources/resources.txt";
        Scanner sc = new Scanner(System.in); //import java.util.Scanner;
        File file = new File(fileName); //import java.io.File;

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            var userInput = "";
            do {
                System.out.println("Enter text: ");
                userInput = sc.nextLine();
                Files.writeString(file.toPath(), userInput); //import java.nio.file.Files;
            } while (!userInput.equals("done"));

        } catch (IOException e) { //import java.io.IOException;
            throw new RuntimeException(e);
        }
    }*/

    // bufferedReader, StringBuilder, etc
/*    public static void main(String[] args) {
        StringBuilder res = new StringBuilder(); // nu merge

        List<String> lines = Files.readAllLines(Path.of("resources/resources.txt"));
        for (String line : lines) {
            res.append(line);
        }
        return res.toString();
    }
        try {
            List<String> lines = Files.readAllLines(Path.of("resources/resources.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
    // exercitii in clasa - utilizatorul introduce text; de citit textul introdus
    static String fileName = "resources/resources.txt";

    public static String readFromFile() throws IOException {
        StringBuilder sc = new StringBuilder();
        List<String> lines = Files.readAllLines(Path.of(fileName));
        for (String line : lines) {
            sc.append(line).append("\n");
        }
        return sc.toString();
    }

    public static void writeToFile(String text, boolean append) throws IOException {
        if (append) {
            Files.writeString(Path.of(fileName), text, StandardOpenOption.APPEND);
        } else {
            Files.writeString(Path.of(fileName), text);
        }
    }

    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in); //import java.util.Scanner;
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        try {
            writeToFile(text, true);
            System.out.println("The text from file:dgd676");
            System.out.println(readFromFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
// ex 1 - numarul de cuvinte
// ex 2 - numarul de linii, cuvinte, caractere
        try {
            String text = readFromFile();
            System.out.println("Total lines - " + text.split("\n").length);
            System.out.println("Total words - " + text.split("\n|\s").length);
            System.out.println("Total characters - " + text.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
// ex 3 - cauta text - il inlocuieste cu altul
/*        String whatToFind = "text";
        String textToReplace = "word";
        try {
            String text = readFromFile();
            text = text.replaceAll(whatToFind, textToReplace);
            writeToFile(text, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
// serialized / deserialized - pentru informatie

}
