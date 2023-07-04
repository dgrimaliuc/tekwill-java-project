package anna_gontari.Inheritance;

import java.util.ArrayList;

public class testingEmployee {
    public static void main(String[] args) {

        Manager myManager = new Manager(30554, "John Johnson", 5000, "Management", 5);
        System.out.println(myManager.getId() + " : " + myManager.getName() + " : " + myManager.getSalary() + " : " + myManager.getDepartment()+ " : " + myManager.getManagedEmployees());

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
