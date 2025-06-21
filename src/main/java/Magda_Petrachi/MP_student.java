package main.java.Magda_Petrachi;

public class MP_student {
    private String name;
    private int age;
    private double nota;
    private int studentID;

    // Constructor
    public MP_student(String name, int age, double nota, int studentID) {
        this.name = name;
        this.age = age;
        this.nota = nota;
        this.studentID = studentID;
        System.out.println("Student " + name);
    }

    // Getter și setter pentru name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter și setter pentru age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter și setter pentru nota
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Getter și setter pentru studentID
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "MP_student{" +
                "studentID=" + studentID +
                ", nota=" + nota +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
