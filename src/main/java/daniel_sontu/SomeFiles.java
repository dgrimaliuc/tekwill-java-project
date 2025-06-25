package main.java.daniel_sontu;

import java.io.File;
import java.io.IOException;

public class SomeFiles {
    public static void main(String[] args) {
        File file = new File("src/main/java/daniel_sontu/fileName.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred when creating the file: " + e.getMessage());
        }

//        // Stergerea
//        if (file.delete()) {
//            System.out.println("File deleted: " + file.getName());
//        } else {
//            System.out.println("Failed to delete the file.");
//    }
}
    }


