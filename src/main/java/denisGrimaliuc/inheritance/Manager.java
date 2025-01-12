package main.java.denisGrimaliuc.inheritance;


/**
 * Proiectați o subclasă numită „Manager” care moștenește de la „Employee” și include variabile de instanță suplimentare,
 * cum ar fi departamentul și numărul de angajați gestionați.
 */
public class Manager extends Employee {
    String department;
    int numberOfEmployeesManaged;

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", numberOfEmployeesManaged=" + numberOfEmployeesManaged +
                ", employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    Manager(int employeeID, String name, double salary, String department, int numberOfEmployeesManaged) {
        super(employeeID, name, salary);
        this.department = department;
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }
}
