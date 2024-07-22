package SergheiRubailo.Task7_2;

public class Person {

    String firstName;
    String lastName;
    Integer age;

    public Person(String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }

    public void printInfo() {
        System.out.println("Name: " + firstName + " " + lastName + " Age: " + age);
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Age: " + age;
    }
}
