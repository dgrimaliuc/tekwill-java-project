package main.java.Magda_Petrachi;

public class MP_student {
    private String name;
    int age;
    private double nota;
    private int studentID;

//    public MP_Student(String name, int age, double nota, int studentID) {
//        this.name = name;
//        this.age = age;
//        this.nota = nota;
//        this.studentID = studentID;
//        System.out.println("Student" + name);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge() {
        this.age = age;
    }

    public Double getNote() {
        return nota;
    }

    public double setNota() {
        this.nota = nota;
    }

    public int getStudentID() {
        return studentID;
    }

    public int setStudentID() {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "MP_Student{" +
                "studentID=" + studentID +
                ", nota=" + nota +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
