package main.java.NataliaChihai;

public class Student {
    String nume;
    int varsta;
    double nota;
    String studentID;

    public Student(String nume, int varsta, double nota, String studentID) {
        this.nume = nume;
        this.varsta = varsta;
        this.nota = nota;
        this.studentID = studentID;
    }

    public void afiseazaInfo() {
        System.out.println("Student: " + nume + ", Vârsta: " + varsta + ", Notă: " + nota + ", ID: " + studentID);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 20, 9.5, "S001");
        Student s2 = new Student("Mihai", 22, 8.7, "S002");
        Student s3 = new Student("Elena", 21, 9.9, "S003");

        s1.afiseazaInfo();
        s2.afiseazaInfo();
        s3.afiseazaInfo();
    }
}
