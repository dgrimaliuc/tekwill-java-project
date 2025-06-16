package main.java.daniel_sontu;

public class Person {
    String firstName = "Adam";
    String lastName = "Smith";
    int age = 32;


    //exemplu de constructor
    Person(String fName, String lName, int a){
        firstName = fName;
        lastName = lName;
        age = a;
    }

void printInfo(){
        System.out.println("First name " +firstName);
        System.out.println("Last name " +lastName);
        System.out.println("Age " +age);
    }

    String GetFullName(){
        return firstName + " " +lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
