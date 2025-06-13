package main.java.cristina;

public class Student {
    public String name;
    public int age;
    public double mark;
    public int StudentID;

    void printInfo() {
        System.out.println("Numele studentului: " + name);
        System.out.println("Varsta: " + age);
        System.out.println("Nota: " + mark);
        System.out.println("StudentID: " + StudentID);
    }
}
