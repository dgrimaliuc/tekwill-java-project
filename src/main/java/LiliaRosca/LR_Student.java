package main.java.LiliaRosca;

public class LR_Student {
    // HW 2. Definește o clasă  Student cu variabile de instanță - nume, vârstă, notă și studentID. Creati constructorii.
// Creati in Main 2 obiecte ale clasei Student. Creati print info and afisati informatia despre obiecte in Main.
    String nume;
    int varsta;
    int nota;
    int studentId;

    LR_Student(String name, int age, int grade, int id) {
        nume = name;
        varsta = age;
        nota = grade;
        studentId = id;
    }

    public void printInfoS() {
        System.out.println("Nume: " + nume);
        System.out.println("Varsta: " + varsta);
        System.out.println("Nota: " + nota);
        System.out.println("Identificatorul: " + studentId);
    }
}