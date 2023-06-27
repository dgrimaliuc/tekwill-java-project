package anna_gontari.Inheritance;

import java.util.ArrayList;

public class testingEmployee {
    public static void main(String[] args) {

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
  }
}
