package main.java.lilia_toma;

public class Method_Employee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(2058);
        employee.setName("Popescu Dina");
        employee.setSalary(20000.50);

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
