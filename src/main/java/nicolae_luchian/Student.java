package main.java.nicolae_luchian;

public class Student {
    private int age;
    private String name;
    private double score;
    private int studentId;

    public Student(int age, String name, double score, int studentId) {
        this.age = age;
        this.name = name;
        this.score = score;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", studentId=" + studentId +
                '}';

    }

    public void printStudentInfo() {
        System.out.println(this.toString());
    }
}
