package main.java.alexandru_todos;

public class Student {
    String name;
    int age;
    int mark;
    int studentID;

    Student(String name, int age, int mark, int studentID) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.studentID = studentID;
    }

    public void getInfo(){
        System.out.println("Name: " + name + ", age: " + age + ", mark: " + mark + ", studentID: " + studentID);
    }
}