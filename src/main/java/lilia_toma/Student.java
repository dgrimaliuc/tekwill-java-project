package main.java.lilia_toma;

public class Student {
//    String FirstName = "Liviu";
//    String LastName = "Bobu";
//    int age = 16;
//    int note = 10;
//    int studentID = 1017;
//
//
//    void printInfo() {
//        System.out.println("FirstName: " + FirstName);
//        System.out.println("LastName: " + LastName);
//        System.out.println("Age: " + age);
//        System.out.println("Note: " + note);
//        System.out.println("StudentID: " + studentID);
//    }
//}
/// /practica Incapsulare (Encapsulation)-------
    /**
     * Dezvoltati o clasa numita "Student" cu variabile de instanta private
     * pentru ID-ul studentului, nume si nota. Scrieti metode getter si setter
     * pentru fiecare variabila. Setter-ul ar trebui sa verifice valoarea
     * inainte de a o seta.
     */
    private int id;
    private String name;
    private double note;

    public Student(int id, String name, double note) {
        setId(id);
        setName(name);
        setNote(note);
    }

    public int getId() {
        return id;
    }

    public void setId(int idd) {
        if (id >= 100 && id <= 200) {
            this.id = id;
        } else {
            System.out.println("Nu exista un student cu asa ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.length() <= 30) {
            this.name = name;
        } else {
            System.out.println("Numele este invalid!");
        }
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        if (note <= 10 && note >= 7) {
            this.note = note;
        } else {
            System.out.println("Nota nu este trecatoare.");
        }
    }

    public String toString() {
        return "Student [ID:" + id + ", Nume: " + name + ", Nota: " + note + "]";
    }
}
