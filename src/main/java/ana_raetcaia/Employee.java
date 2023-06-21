package ana_raetcaia;

public class Employee {
    //2. Create a class named "Employee" with private instance variables for employee ID, name, and salary.
    // Include appropriate getter and setter methods for each variable.
  private int id;
  private String name;
  private int salary;

  public Employee(int id, String name, int salary ){
      this.id = id;
      this.name = name;
      this.salary = salary;
  }


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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
