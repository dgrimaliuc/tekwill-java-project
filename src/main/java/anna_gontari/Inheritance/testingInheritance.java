package anna_gontari.Inheritance;

import java.util.ArrayList;

public class testingInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("dachshund", 3 );
        System.out.println(myDog.breed + " : " + myDog.age + " : " + myDog.weight);

        //Create List of Dog with some objects inside, print all objects info in a foreach loop.

        ArrayList<String> dog = new ArrayList<>();
        dog.add("Chihuahua");
        dog.add("Labrador");
        dog.add("Spitz");
        dog.add("German Shepherd");
        for (String x : dog) {
            System.out.println(x);
        }

        Manager myManager = new Manager("HR", 10000);
        System.out.println(myManager.ID + " : " + myManager.name + " : " + myManager.department + " : " + myManager.salary);

        //Create a List of Employee with some object inside, print all objects info in a foreach loop.
        ArrayList<String> Employee = new ArrayList<>();

        Employee.add("Accountant Maria");
        Employee.add("Supervisor Alex");
        Employee.add("Technologist Mario");
        Employee.add("Head of department Christina");

        for (String x : Employee) {
            System.out.println(x);
        }

        Rectangle myRectangle = new Rectangle(50,30);
        System.out.println(myRectangle.color + " : " + myRectangle.width + " : " + myRectangle.height);
    }
}
