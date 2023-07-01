package alina_gutsul.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private int id;
    private String name;
    private String lastName;
    private List<Integer> grades;

    public Student(int id, String name, String lastName, List<Integer> grades) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                '}';
    }
}

class GradeBook {
    public void saveStudent(Student student, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(student);
            System.out.println("Student saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving student: " + e.getMessage());
        }
    }

    public Student loadStudent(String filename) {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            return (Student) objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while loading student: " + e.getMessage());
        }
        return null;
    }
}

public class GradeBookExample {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        List<Integer> grades1 = new ArrayList<>();
        grades1.add(90);
        grades1.add(85);
        Student student1 = new Student(1, "John", "Doe", grades1);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(80);
        grades2.add(75);
        Student student2 = new Student(2, "Jane", "Smith", grades2);

        gradeBook.saveStudent(student1, "student1.ser");
        gradeBook.saveStudent(student2, "student2.ser");

        Student loadedStudent1 = gradeBook.loadStudent("student1.ser");
        if (loadedStudent1 != null) {
            System.out.println("Loaded student 1: " + loadedStudent1);
        }

        Student loadedStudent2 = gradeBook.loadStudent("student2.ser");
        if (loadedStudent2 != null) {
            System.out.println("Loaded student 2: " + loadedStudent2);
        }
    }
}

