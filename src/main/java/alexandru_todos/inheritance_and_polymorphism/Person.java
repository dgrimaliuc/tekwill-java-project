package main.java.alexandru_todos.inheritance_and_polymorphism;

// Inheritance: Create a class called ‘Person’ with instance variables for name, age and address.
// Design a subclass named ‘Employee’ that inherits from ‘Person’ and includes additional instance variables
// such as employee ID and salary.
public class Person {
    public String name;
    public int age;
    public String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
