package main.java.georgeVinaga;

public class PersonClassWork_20_12_2024 {
//    String firstName = "Adam";
//    String lastName = "Smith";
//    int age = 32;
//
//    public void printInfo() {
//        System.out.println("First name: " + firstName);
//        System.out.println("Last name: " + lastName);
//        System.out.println("Age: " + age);
//    }

    // Aceeasi insarcinare, doar ca folosim constructor
    String firstName;
    String lastName;
    int age;

    PersonClassWork_20_12_2024(String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }

    public void printInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
    }
}
