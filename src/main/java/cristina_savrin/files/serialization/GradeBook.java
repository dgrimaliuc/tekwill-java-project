package cristina_savrin.files.serialization;

import java.io.*;
import java.util.ArrayList;

public class GradeBook {

    public static void main(String[] args) {

        File file = new File("./src/main/java/cristina_savrin/files/serialization/studentsDB.txt");

        Student student1 = new Student(101, "Ivan", "Ivanov", new int[]{8, 10, 9, 10, 7});
        Student student2 = new Student(102, "Petru", "Petrov", new int[]{8, 6, 9, 7, 7});
        Student student3 = new Student(103, "Olga", "Sidorova", new int[]{9, 9, 10, 8, 9});
        Student student4 = new Student(104, "Nicolai", "Rotaru", new int[]{7, 5, 6, 7, 9});
        Student student5 = new Student(105, "Maria", "Ursu", new int[]{10, 9, 10, 9, 10});

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);
        saveStudent(studentsList, file);

        ArrayList<Student> loadedStudentsList = new ArrayList<>();
        loadedStudentsList = loadStudent(file);

        for (Student s : loadedStudentsList) {
            System.out.println(s);
        }
    }


    // Serialization
    public static void saveStudent(ArrayList<Student> list, File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    // Deserialization
    public static ArrayList<Student> loadStudent(File file) {

        ArrayList<Student> studentsList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            studentsList = (ArrayList<Student>) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return studentsList;
    }
}