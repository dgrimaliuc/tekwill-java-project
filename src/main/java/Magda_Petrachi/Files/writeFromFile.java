package main.java.Magda_Petrachi.Files;

import java.io.File;
import java.nio.file.Files;

class findWord {
    public static String readFromFile(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("Fișierul a fost creat cu succes: " + file.getName());
                return "";
            } else {
                System.out.println("Fișierul există deja.");
                return new String(Files.readAllBytes(file.toPath()));
            }
        } catch (Exception e) {
            System.out.println("A apărut o eroare: " + e.getMessage());
            return "";
        }
    }

    public static void main(String[] args) {
        String textToReplace = "Java";
        String replacementText = "JAVA";
        String fileName = "resources/resources.txt";

        File file = new File(fileName);

        String textFromFile = readFromFile(file);

        String modifiedText = textFromFile.replaceAll(textToReplace, replacementText);

        try {
            Files.write(file.toPath(), modifiedText.getBytes());
            System.out.println("Fişier actualizat cu succes!");
        } catch (Exception e) {
            System.out.println("A apărut o eroare la scriere: " + e.getMessage());
        }
    }
}
