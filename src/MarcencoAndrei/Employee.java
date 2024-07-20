package MarcencoAndrei;

public class Employee {
    private int employeeid;
    private String name;
    private int salary;

    public Employee(int employeeid, String name, int salary) {
        this.employeeid = employeeid;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
