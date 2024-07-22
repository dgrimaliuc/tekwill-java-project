package Lesson6AnastasiaGoncear.Inheritance;

import Lesson6AnastasiaGoncear.BankAccount;

public class Runner {
    public static void main(String[] args) {


        Student student1 = new Student("Vasea", 22, "Address", "123", "MasterInPhysics");
        Student student2 = new Student("Ion", 20, "Address", "1123", "MasterInPhysics");
        System.out.println("Student1  "+  student1.getName());
        System.out.println("Student2  "+  student2.getAge());

      student2.setAge(25);

        student2.printInfo();
    }}

