package main.java.iuliaNamolovan.hm7;

public class Intern extends Employee {
    String schoolName;
    int internshipDuration;

    Intern(int eID, String n, double s, String sN, int iD) {
        super(eID, n, s);
        this.schoolName = sN;
        this.internshipDuration = iD;
    }

    public String toString() {
        return super.toString() +
                ", Intern{" +
                "School='" + schoolName + '\'' +
                ", Duration=" + internshipDuration + " months" +
                '}';
    }
}

