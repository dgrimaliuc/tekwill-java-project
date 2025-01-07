package main.java.LunguSergiu;

public class Sudent_LS {
    String studentName;
    int age;
    double studentMark;
    int studentID;

    Sudent_LS(String Name, String a, String Mark, String ID) {
        studentName = Name;
        age = Integer.parseInt(a);
        studentMark = Double.parseDouble(Mark);
        studentID = Integer.parseInt(ID);
    }

    public void printInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Mark: " + studentMark);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);
    }
}
