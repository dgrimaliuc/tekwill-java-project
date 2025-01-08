package main.java.denisGrimaliuc.incapsulation;

// Definește o clasă numită Student cu variabile de instanță cum ar fi nume, vârstă, notă și studentID.
public class Student {
    String fullName;
    String age;
    int grade;
    int studentId;

    Student(String name, String a, int g, int id) {
        fullName = name;
        age = a;
        grade = g;
        studentId = id;
    }

    public void printInfo() {
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentId + "\n");
    }

}
