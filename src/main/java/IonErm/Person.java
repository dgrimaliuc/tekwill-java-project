package main.java.IonErm;

public class Person {
    String firstName;
    String lastName;
    int age;

    Person(String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }

    public void printInfo() {
        System.out.println("First name " + firstName);
        System.out.println("Last name " + lastName);
        System.out.println("Age " + age);
    }
}
