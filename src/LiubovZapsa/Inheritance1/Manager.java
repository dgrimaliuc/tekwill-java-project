package LiubovZapsa.Inheritance1;

public class Manager extends Employee {
    private String department;
    private int numberEmployees;

    public Manager(int employeeID, String name, double salary, String department, int numberEmployees) {
        super(employeeID, name, salary);
        this.department = department;
        this.numberEmployees = numberEmployees;
    }

    public String getDeprtament() {
        return department;
    }

    public void setDepartment(String departament) {
        this.department = department;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public void printInfo() {
        System.out.println("EmployeeID: " + getEmployeeID());
        System.out.println("name: " + getName());
        System.out.println("salary: " + getSalary());
        System.out.println("department: " + getDeprtament());
        System.out.println("numberEmployees: " + getNumberEmployees());
    }

}
