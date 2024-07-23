package RevaSadovnicova.inheritance;

public class Employee {
    private Integer employeeID;
    private String name;
    private Integer salary;

    public Employee( Integer employeeID,String name,Integer salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
