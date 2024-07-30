package main.java.PotoracMihai.task6_19_07_24.inheritance;

public class Student extends Person {

    private int studentID;

    private int grade;

    Student(String name, int age, String address, int studentID, int grade) {
        super(name, age, address);
        this.studentID = studentID;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
