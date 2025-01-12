package main.java.iuliaNamolovan.IN_HM6;

public class Student {
    String name;
    int varsta;
    double nota;

    Student(String n, int v, double no) {
        name = n;
        varsta = v;
        nota = no;
    }

    public void printInfo() {
        System.out.println("Student's name:" + name);
        System.out.println("Student's age:" + varsta);
        System.out.println("Student's grade:" + nota);
    }
}
