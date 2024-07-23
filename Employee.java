package IgorTabirta.Les_July19.Inheritance.HW;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
