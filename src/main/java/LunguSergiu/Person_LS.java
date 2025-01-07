package main.java.LunguSergiu;

public class Person_LS {
    String firstName;
    String lastName;
    int age;

    Person_LS(String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }

    public void printInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}
