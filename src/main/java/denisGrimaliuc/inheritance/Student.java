package main.java.denisGrimaliuc.inheritance;


/**
 * Proiectați o subclasă numită „Student” care moștenește de la „Person” și include variabile de instanță suplimentare,
 * cum ar fi ID-ul studentului și nota (curs).
 */
public class Student extends Person {
    int studentID;
    double grade;

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    Student(String name, int age, String address, int studentID, double grade) {
        super(name, age, address);
        this.studentID = studentID;
        this.grade = grade;
    }
}
