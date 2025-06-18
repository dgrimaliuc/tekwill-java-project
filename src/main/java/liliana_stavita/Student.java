package main.java.liliana_stavita;

public class Student {
    String name;

    int age;

    double grade;

    double studentID;

    Student(String name, int age, double grade) {
        studentID = Math.random();
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void printInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------");

    }
}
