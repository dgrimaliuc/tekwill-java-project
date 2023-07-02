package alina_gutsul.abstractClasses;

abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 1001, 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 2001, 20, 30);

        double fullTimeSalary = fullTimeEmployee.calculateSalary();
        System.out.println("Full Time Employee: " + fullTimeEmployee.getName());
        System.out.println("Employee ID: " + fullTimeEmployee.getEmployeeId());
        System.out.println("Monthly Salary: " + fullTimeSalary);

        double partTimeSalary = partTimeEmployee.calculateSalary();
        System.out.println("\nPart Time Employee: " + partTimeEmployee.getName());
        System.out.println("Employee ID: " + partTimeEmployee.getEmployeeId());
        System.out.println("Hourly Rate: " + partTimeEmployee.getHourlyRate());
        System.out.println("Hours Worked: " + partTimeEmployee.getHoursWorked());
        System.out.println("Total Salary: " + partTimeSalary);
    }
}
