package main.java.daniel_sontu;

public class Student {
    String nume;
    int varsta;
    double nota;
    int studentID;


    @Override
    public String toString() {
        return "Student " +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", nota=" + nota +
                ", studentID=" + studentID;
    }

    Student(String nume, int varsta, double nota, int studentID) {
    this.nume = nume;
    this.varsta = varsta;
    this.nota = nota;
    this.studentID = studentID;
    }
}
