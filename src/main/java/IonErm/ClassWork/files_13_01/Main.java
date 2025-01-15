package main.java.IonErm.ClassWork.files_13_01;

import java.io.File;
import java.io.IOException;

public class Main {
    public static String main(String[] args) {
        File file = new File("resources\\index.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("File already exists");
        }

        if (file.delete()) {
            System.out.println("File " + file.getName() + " deleted!");
        } else {
            System.out.println("File already deleted!");
        }
        return "";
    }
}
