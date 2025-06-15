package main.java.denis_grimaliuc;

public class Person {

    String firstName;
    String lastName;
    int age;


    Person(String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }

    Person(String fName) {
        firstName = fName;
        lastName = "Unknown";
        age = 0;
    }

    Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    String getFullName() {
        return firstName + " " + lastName;
    }

    void printInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}
