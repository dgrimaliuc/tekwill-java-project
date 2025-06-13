package main.java.Magda_Petrachi;

public class MP_Student {
    String name;
    int age;
    double nota;
    int studentID;

public MP_Student(String name, int age, double nota, int studentID){
    this.name = name;
    this.age = age;
    this.nota = nota;
    this.studentID = studentID;
    System.out.println("Student" + name );
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
