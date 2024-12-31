package main.java.LiliaRosca.methods_classes;

public class Person_LR {
    // atribuirea directa a valorilor
    /* String firstName = "David";
    String lastName = "Ricardo";
    int age = 105;*/
    // cu ajutorul Constructorului
    String firstName;
    String lastName;
    int age;

    /* Person_LR() { // constructor - denumirea trebuie sa coincida cu denumirea clasei
        firstName = "David";
        lastName = "Ricardo";
        age = 105;
    } // !!! constructorul nu poate avea return
    */
    Person_LR(String fName, String lName, int a) { // constructor cu parametrii
        firstName = fName;
        lastName = lName;
        age = a;
    }

    public void printInfo() { // creaza metoda in interiorul clasei
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
    }
}
