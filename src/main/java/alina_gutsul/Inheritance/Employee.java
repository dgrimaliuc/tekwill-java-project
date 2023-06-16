package alina_gutsul.Inheritance;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String department;
    private int numberOfEmployeesManaged;

    // Constructor
    public Manager(int employeeId, String name, double salary, String department, int numberOfEmployeesManaged) {
        super(employeeId, name, salary);
        this.department = department;
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }

    // Getter methods
    public String getDepartment() {
        return department;
    }

    public int getNumberOfEmployeesManaged() {
        return numberOfEmployeesManaged;
    }
}

