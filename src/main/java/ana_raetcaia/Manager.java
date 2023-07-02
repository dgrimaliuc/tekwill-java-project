package ana_raetcaia;

public class Manager extends Employee {
    //2. Create a class named "Employee" with instance variables for employee ID, name, and salary.
    // Design a subclass called "Manager" that inherits from "Employee" and includes additional instance
    // variables such as department and number of employees managed, create constructors to initial
    // ize all variables.
    String department;
    int numberofEmployees;

    Manager(String department, int numberofEmployees, int id, String name, int salary){
    super (id, name, salary);
    this.department = department;
    this.numberofEmployees = numberofEmployees;
    }

    public static void main (String[]args){
        Manager managerObj = new Manager("Sales", 12, 4,"Ivan",4853);

        System.out.println(managerObj.department);
        System.out.println(managerObj.numberofEmployees);
        System.out.println(managerObj.getId());
        System.out.println(managerObj.getName());
        System.out.println(managerObj.getSalary());

    }

}

