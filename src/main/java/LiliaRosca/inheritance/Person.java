package main.java.LiliaRosca.inheritance;

public class Person {
    // Exercitii class 23.12 Ex 2
    String firstName;
    String lastName;
    int age;

    Person(String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }

    public String getfullName() { // creaza metoda in interiorul clasei
        return firstName + " " + lastName + " " + age;
    }
}