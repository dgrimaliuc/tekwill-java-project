package VictorMurashev.homework_20240720.task2;

public class Employee {
    private String employeeID;
    private String name;
    private double salary;

    //Constructor


    public Employee(String employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    //Checking for negative salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else System.out.println("Salary cannot be negative");
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
