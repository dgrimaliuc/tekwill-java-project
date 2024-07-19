package VictorMurashev.homework_20240720.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("ID-01234", "John Smith", 1500);
        //Printing initial employee info
        System.out.println(employee);
        //Set up new salary
        employee.setSalary(2500);
        //Printing employee info with the new salary
        System.out.println(employee);
        //Trying to set up negative salary
        employee.setSalary(-3000);
    }
}
