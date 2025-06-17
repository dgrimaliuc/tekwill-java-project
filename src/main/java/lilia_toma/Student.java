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
    private double Id;
    private String Name;
    private double Note;

    public double getId() {
        return Id;
    }

    public void setId(double Id) {
        if (Id >= 100) {
            this.Id = Id;
        } else {
            System.out.println("Nu exista un student cu asa ID.");
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
//        if
        this.Name = name;
    }

    public double getNote() {
        return Note;
    }

    public void setNote(double Note) {
        this.Note = Note;
    }
}
