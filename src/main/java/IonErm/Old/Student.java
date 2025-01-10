package main.java.IonErm.Old;

public class Student {
    String name;
    int age;
    double note;
    int studentID;

    Student(String name, int age, double note, int studentID) {
        this.name = name;
        this.age = age;
        this.note = note;
        this.studentID = studentID;
    }

    public void printInfo() {
        System.out.println("Student name - " + name);
        System.out.println("Student age - " + age);
        System.out.println("Note - " + note);
        System.out.println("Student ID - " + studentID);
    }
}

