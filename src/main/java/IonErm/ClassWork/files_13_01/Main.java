package main.java.IonErm.ClassWork.files_13_01;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        File file = new File("resources\\index.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("File already exists");
//        }

//        var fileName = "index.txt";
//        System.out.println("Enter text: ");
//        Scanner scanner = new Scanner(System.in);
//        var userInput = scanner.nextLine();
//        File file = new File(fileName);
//
//
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            do{
//
//            }
//            Files.writeString(file.toPath(), userInput);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        StringBuilder read = new StringBuilder();
//        List<String> lines = Files.readAllLines(Path.of("index.txt"));
//        for (String line : lines) {
//            read.append(line);
//        }
//        return read.toString();

        /*H*/
        File file = new File("index.txt");

        if (file.delete()) {
            System.out.println("File " + file.getName() + " deleted!");
        } else {
            System.out.println("File already deleted!");
        }

    }
}
