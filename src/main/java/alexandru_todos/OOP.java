package main.java.alexandru_todos;


import main.java.alexandru_todos.inheritance_and_polymorphism.*;
import main.java.alexandru_todos.inheritance_and_polymorphism.Car;
import main.java.alexandru_todos.inheritance_and_polymorphism.Employee;

public class OOP {

    // Methods
    // 1. Write a Java method called ‘greet’ that displays
    // a greeting in the console, such as ‘Hello World!’
    static void greet(String i) {
        System.out.println(i);
    }

    // 2. Write a method that takes two integers as parameters
    // and returns their difference. (-)
    static void difference(int x, int y) {
        var finalsum = x - y;
        System.out.println("Task 2: Difference is: " + finalsum);
    }

    // 3. Create a method that accepts three integers as parameters
    // and returns the maximum of the three.
    static void returnMax(int a, int b, int c) {
        var firstCheck = Math.max(a, b);
        var finalCheck = Math.max(firstCheck, c);
        System.out.println("Task 3: Max integer is: " + finalCheck);
    }

    // 4. Create a method that will accept Integer arguments
    // and return the sum of all.
    static int sumAll(Integer... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    // Classes
    // Define a class named Student with instance variables
    // such as name, age, grade and studentID.


    public static void main(String[] args) {
        greet("Task 1: Hello user");
        difference(5, 25);
        returnMax(4, 676, 33);
        System.out.println("Task 4: Sum of all integers is: " + sumAll(1, 2, 3, 4, 5, 6, 7, 5634));
        Student student = new Student("Alex", 20, 8, 12345);
        Student student1 = new Student("Ivan", 19, 6, 12346);
        Student student2 = new Student("Andrei", 22, 10, 54321);
        System.out.println("Task 5:");
        student.getInfo();
        student1.getInfo();
        student2.getInfo();
        Fruit fruit = new Fruit("Apple", "Red", 52);
        Fruit fruit1 = new Fruit("Grapefruit", "Pink", 42);
        Fruit fruit2 = new Fruit("Pear", "Yellow", 57);
        System.out.println("Task 6:");
        fruit.getInfo();
        fruit1.getInfo();
        fruit2.getInfo();
        Animals animal = new Animals("Dog", 4, "Woof");
        Animals animal1 = new Animals("Cat", 3, "Meow");
        Animals animal2 = new Animals("Goose", 1, "Quack");
        System.out.println("Task 7:");
        animal.getInfo();
        animal1.getInfo();
        animal2.getInfo();
        System.out.println("Inheritance homework:");
        Employee employee1 = new Employee("John", 27, "Random street 1", 1337, 2000);
        System.out.println("Our new employee is: " + employee1.name + ", age: " + employee1.age + ". His ID is " +
                employee1.ID + ".");
        System.out.println("Override:");
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        Vehicle myTruck = new Truck();
        myVehicle.startEngine();
        myCar.startEngine();
        myMotorcycle.startEngine();
        myTruck.startEngine();
        System.out.println("Overload:");
        Display display = new Display();
        System.out.println(display.show(5));
        System.out.println(display.show(1.3));
        System.out.println(display.show("Demonstrate display class overload"));
    }
}
