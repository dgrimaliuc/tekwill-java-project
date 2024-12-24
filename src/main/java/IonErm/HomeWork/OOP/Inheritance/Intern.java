package main.java.IonErm.HomeWork.OOP.Inheritance;

public class Intern extends Employee {
    public String schoolName;
    public int durationStage;

    Intern(int ID, String name, double salary, String schoolName, int durationStage) {
        super(ID, name, salary);
        this.schoolName = schoolName;
        this.durationStage = durationStage;
    }
}
